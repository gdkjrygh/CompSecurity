// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.speech.tts;

import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.util.Locale;
import java.util.Set;

class TextToSpeechICSMR1
{
    static interface UtteranceProgressListenerICSMR1
    {

        public abstract void onDone(String s);

        public abstract void onError(String s);

        public abstract void onStart(String s);
    }


    public static final String KEY_FEATURE_EMBEDDED_SYNTHESIS = "embeddedTts";
    public static final String KEY_FEATURE_NETWORK_SYNTHESIS = "networkTts";

    TextToSpeechICSMR1()
    {
    }

    static Set getFeatures(TextToSpeech texttospeech, Locale locale)
    {
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            return texttospeech.getFeatures(locale);
        } else
        {
            return null;
        }
    }

    static void setUtteranceProgressListener(TextToSpeech texttospeech, UtteranceProgressListenerICSMR1 utteranceprogresslistenericsmr1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            texttospeech.setOnUtteranceProgressListener(new UtteranceProgressListener(utteranceprogresslistenericsmr1) {

                final UtteranceProgressListenerICSMR1 val$listener;

                public void onDone(String s)
                {
                    listener.onDone(s);
                }

                public void onError(String s)
                {
                    listener.onError(s);
                }

                public void onStart(String s)
                {
                    listener.onStart(s);
                }

            
            {
                listener = utteranceprogresslistenericsmr1;
                super();
            }
            });
            return;
        } else
        {
            texttospeech.setOnUtteranceCompletedListener(new android.speech.tts.TextToSpeech.OnUtteranceCompletedListener(utteranceprogresslistenericsmr1) {

                final UtteranceProgressListenerICSMR1 val$listener;

                public void onUtteranceCompleted(String s)
                {
                    listener.onStart(s);
                    listener.onDone(s);
                }

            
            {
                listener = utteranceprogresslistenericsmr1;
                super();
            }
            });
            return;
        }
    }
}
