// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, App, adp, DescribeProblemActivity, 
//            ig, a3b

public class CorruptInstallationActivity extends DialogToastActivity
{

    private static final String z[];

    public CorruptInstallationActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        int j;
        j = App.am;
        super.onCreate(bundle);
        setContentView(0x7f03001a);
        bundle = (TextView)findViewById(0x7f0b0083);
        Spanned spanned = Html.fromHtml(getString(0x7f0e0104));
        obj = new SpannableStringBuilder(spanned);
        URLSpan aurlspan[] = (URLSpan[])spanned.getSpans(0, spanned.length(), android/text/style/URLSpan);
        if (aurlspan != null)
        {
            int k = aurlspan.length;
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                URLSpan urlspan = aurlspan[i];
                if (z[2].equals(urlspan.getURL()))
                {
                    Log.i(z[1]);
                    int l = ((SpannableStringBuilder) (obj)).getSpanStart(urlspan);
                    int i1 = ((SpannableStringBuilder) (obj)).getSpanEnd(urlspan);
                    int j1 = ((SpannableStringBuilder) (obj)).getSpanFlags(urlspan);
                    ((SpannableStringBuilder) (obj)).removeSpan(urlspan);
                    ((SpannableStringBuilder) (obj)).setSpan(new adp(new Intent(null, null, this, com/whatsapp/DescribeProblemActivity)), l, i1, j1);
                }
                i++;
            } while (j == 0);
        }
        bundle.setText(((CharSequence) (obj)));
        bundle.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button)findViewById(0x7f0b007f)).setOnClickListener(new ig(this));
        ((Button)findViewById(0x7f0b0082)).setOnClickListener(new a3b(this));
        bundle = findViewById(0x7f0b007e);
        obj = findViewById(0x7f0b0080);
        App.u;
        JVM INSTR tableswitch 1 1: default 268
    //                   1 275;
           goto _L1 _L2
_L1:
        ((View) (obj)).setVisibility(8);
_L3:
        return;
_L2:
        TextView textview = (TextView)findViewById(0x7f0b0081);
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        textview.setText(Html.fromHtml(String.format(getString(0x7f0e0106), new Object[] {
            z[0]
        })));
        bundle.setVisibility(8);
        if (j == 0) goto _L3; else goto _L1
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\036\032p\r}LA+\ny\001@s\025o\002\035e\r~X\rk\020";
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
                obj = "\025\001j\to\025\032)\016{\006\036k\017zV\002m\023eV\bk\b`\022";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\025\001j\to\025\032)\016{\006\036k\017z";
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
    //                   3 194;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        byte byte0 = 14;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 118;
          goto _L9
_L5:
        byte0 = 110;
          goto _L9
_L6:
        byte0 = 4;
          goto _L9
        byte0 = 125;
          goto _L9
    }
}
