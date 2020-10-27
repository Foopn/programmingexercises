package kyh.lectures.lecture16;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public abstract class Instrument {
    private static MidiChannel[] channels;
    private int instrument = 15;

    public int getInstrument() {
        return instrument;
    }

    public void play(int note, int time) {
        Synthesizer synth = null;
        try {
            synth = MidiSystem.getSynthesizer();
            synth.open();
            channels = synth.getChannels();
            channels[getInstrument()].noteOn(note, 80);
            Thread.sleep(time);
            synth.close();
        } catch (MidiUnavailableException | InterruptedException e) {
            e.printStackTrace();
            synth.close();
        }
    }
}
