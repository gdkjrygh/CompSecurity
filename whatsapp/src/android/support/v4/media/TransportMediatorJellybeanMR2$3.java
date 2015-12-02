// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media:
//            TransportMediatorJellybeanMR2, TransportMediatorCallback

class  extends BroadcastReceiver
{

    private static final String z[];
    final TransportMediatorJellybeanMR2 this$0;

    public void onReceive(Context context, Intent intent)
    {
        try
        {
            context = (KeyEvent)intent.getParcelableExtra(z[1]);
            mTransportCallback.handleKey(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w(z[0], context);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "<?\026Kn\030\"\005Q^\007#\003Wr\004!\022W";
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
                obj = "\t#\023Wr\001)YLs\034(\031Q3\r5\003W|F\0062|B-\0332kI";
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
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 29;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 104;
          goto _L9
_L5:
        byte0 = 77;
          goto _L9
_L6:
        byte0 = 119;
          goto _L9
        byte0 = 37;
          goto _L9
    }
}
