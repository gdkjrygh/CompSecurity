// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

class asn
    implements Runnable
{

    private static final String z[];
    final VoiceService.VoiceServiceEventCallback a;
    final Voip.DebugTapType b;
    final Voip.RecordingInfo c[];

    asn(VoiceService.VoiceServiceEventCallback voiceserviceeventcallback, Voip.RecordingInfo arecordinginfo[], Voip.DebugTapType debugtaptype)
    {
        a = voiceserviceeventcallback;
        c = arecordinginfo;
        b = debugtaptype;
        super();
    }

    public void run()
    {
        Object obj;
label0:
        {
            obj = c[b.ordinal()];
            if (obj != null)
            {
                OutputStream outputstream;
                try
                {
                    outputstream = ((Voip.RecordingInfo) (obj)).a();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    try
                    {
                        throw obj;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw obj;
                    }
                }
                if (outputstream != null)
                {
                    break label0;
                }
            }
            return;
        }
        try
        {
            ((Voip.RecordingInfo) (obj)).a().close();
            Log.i((new StringBuilder()).append(z[1]).append(((Voip.RecordingInfo) (obj)).b()).append(z[0]).append(((Voip.RecordingInfo) (obj)).b().length()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            Log.a(ioexception);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "Hc\021LKH";
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
                obj = "\013q\024Zm\t`\fC\\\rU\026RK\f0";
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
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 46;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 104;
          goto _L9
_L5:
        byte0 = 16;
          goto _L9
_L6:
        byte0 = 120;
          goto _L9
        byte0 = 54;
          goto _L9
    }
}
