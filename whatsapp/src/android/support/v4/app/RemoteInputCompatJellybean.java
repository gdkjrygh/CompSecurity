// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;

class RemoteInputCompatJellybean
{

    private static final String z[];

    static Bundle getResultsFromIntent(Intent intent)
    {
        intent = intent.getClipData();
        ClipDescription clipdescription;
        if (intent != null)
        {
            if ((clipdescription = intent.getDescription()).hasMimeType(z[5]) && clipdescription.getLabel().equals(z[6]))
            {
                return (Bundle)intent.getItemAt(0).getIntent().getExtras().getParcelable(z[7]);
            }
        }
        return null;
    }

    static Bundle toBundle(RemoteInputCompatBase.RemoteInput remoteinput)
    {
        Bundle bundle = new Bundle();
        bundle.putString(z[0], remoteinput.getResultKey());
        bundle.putCharSequence(z[3], remoteinput.getLabel());
        bundle.putCharSequenceArray(z[1], remoteinput.getChoices());
        bundle.putBoolean(z[4], remoteinput.getAllowFreeFormInput());
        bundle.putBundle(z[2], remoteinput.getExtras());
        return bundle;
    }

    static Bundle[] toBundleArray(RemoteInputCompatBase.RemoteInput aremoteinput[])
    {
        boolean flag = NotificationCompatBase.Action.a;
        if (aremoteinput == null)
        {
            return null;
        }
        Bundle abundle[] = new Bundle[aremoteinput.length];
        int i = 0;
        do
        {
            if (i >= aremoteinput.length)
            {
                break;
            }
            abundle[i] = toBundle(aremoteinput[i]);
            i++;
        } while (!flag);
        return abundle;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "w[I{[qu_w";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "fVUgT`M";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "`FN|Vv";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "i_Xk[";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "dRVa@CL_kqjLWGYuKN";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "q[Bz\030sP^ VkZHa^a\020S`C`PN";
                byte0 = 4;
                i = 5;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "dP^|XlZ\024|RhQNk^kNOz\031w[I{[qM";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "dP^|XlZ\024|RhQNk^kNOz\031w[I{[qM~oCd";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 285
    //                   2 292
    //                   3 299;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_299;
_L3:
        byte byte1 = 55;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 5;
          goto _L9
_L5:
        byte1 = 62;
          goto _L9
_L6:
        byte1 = 58;
          goto _L9
        byte1 = 14;
          goto _L9
    }
}
