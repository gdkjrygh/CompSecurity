// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Intent;
import android.os.Bundle;

public class RemoteInput extends RemoteInputCompatBase.RemoteInput
{

    public static final RemoteInputCompatBase.RemoteInput.Factory FACTORY = new _cls1();
    private static final Impl IMPL;
    private final boolean mAllowFreeFormInput;
    private final CharSequence mChoices[];
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    RemoteInput(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
    {
        mResultKey = s;
        mLabel = charsequence;
        mChoices = acharsequence;
        mAllowFreeFormInput = flag;
        mExtras = bundle;
    }

    public static Bundle getResultsFromIntent(Intent intent)
    {
        return IMPL.getResultsFromIntent(intent);
    }

    public boolean getAllowFreeFormInput()
    {
        return mAllowFreeFormInput;
    }

    public CharSequence[] getChoices()
    {
        return mChoices;
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public CharSequence getLabel()
    {
        return mLabel;
    }

    public String getResultKey()
    {
        return mResultKey;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            IMPL = new ImplApi20();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new ImplJellybean();
        } else
        {
            IMPL = new ImplBase();
        }
    }

    private class Impl
    {

        public abstract Bundle getResultsFromIntent(Intent intent);
    }


    private class ImplApi20
        implements Impl
    {

        public Bundle getResultsFromIntent(Intent intent)
        {
            return RemoteInputCompatApi20.getResultsFromIntent(intent);
        }

        ImplApi20()
        {
        }
    }


    private class _cls1
        implements RemoteInputCompatBase.RemoteInput.Factory
    {

        _cls1()
        {
        }
    }


    private class ImplJellybean
        implements Impl
    {

        public Bundle getResultsFromIntent(Intent intent)
        {
            return RemoteInputCompatJellybean.getResultsFromIntent(intent);
        }

        ImplJellybean()
        {
        }
    }


    private class ImplBase
        implements Impl
    {

        private static final String z[];

        public Bundle getResultsFromIntent(Intent intent)
        {
            Log.w(z[0], z[1]);
            return null;
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[2];
            obj = "IQ//v~},0wo";
            byte1 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte1)
                {
                default:
                    as1[i] = ((String) (obj));
                    i = 1;
                    obj = "IQ//v~},0wo\024+3\"tZ.9\"hA20mi@'$\"}F--\"Zd\013`N~B',\"*\002";
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 136
        //                       0 156
        //                       1 162
        //                       2 168
        //                       3 174;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_174;
_L3:
            byte byte0 = 2;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 27;
              goto _L9
_L5:
            byte0 = 52;
              goto _L9
_L6:
            byte0 = 66;
              goto _L9
            byte0 = 64;
              goto _L9
        }

        ImplBase()
        {
        }
    }

}
