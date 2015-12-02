// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, DescribeProblemActivity, yy, asw, 
//            aow, qn

public class UserFeedbackActivity extends DialogToastActivity
{

    private static final String z[];

    public UserFeedbackActivity()
    {
    }

    public static void a(Context context, String s, String s1, Integer integer)
    {
        Intent intent = new Intent(context, com/whatsapp/DescribeProblemActivity);
        intent.putExtra(z[2], s);
        intent.putExtra(z[1], s1);
        if (integer != null)
        {
            intent.putExtra(z[0], integer);
        }
        context.startActivity(intent);
    }

    protected void e(String s)
    {
        asw.a(new yy(this, this, false, false, s), new String[0]);
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 122: // 'z'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setMessage(getString(0x7f0e031a));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 123: // '{'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e03b6).setPositiveButton(0x7f0e04b5, new aow(this)).setNegativeButton(0x7f0e007b, new qn(this)).create();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "B\013\\\t6I\005ET Q\024\037c$R\007CN#D4CH#M\001\\f\"U\rGN5XJE^1D";
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
                obj = "B\013\\\t6I\005ET Q\024\037c$R\007CN#D4CH#M\001\\f\"U\rGN5XJBB3W\001CT5@\020DT";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "B\013\\\t6I\005ET Q\024\037c$R\007CN#D4CH#M\001\\f\"U\rGN5XJWU.L";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 65;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 33;
          goto _L9
_L5:
        byte0 = 100;
          goto _L9
_L6:
        byte0 = 49;
          goto _L9
        byte0 = 39;
          goto _L9
    }
}
