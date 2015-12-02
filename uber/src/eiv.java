// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ImageSpan;

public final class eiv
{

    public static final Uri a = Uri.parse("https://94070.api-01.com/serve?action=click&publisher_id=94070&site_id=59118");

    public static SpannableString a(Resources resources)
    {
        String s = resources.getString(0x7f0702bf);
        SpannableString spannablestring = new SpannableString(s);
        int i = s.indexOf("%1$s");
        spannablestring.setSpan(b(resources), i, i + 4, 17);
        return spannablestring;
    }

    private static ImageSpan b(Resources resources)
    {
        resources = resources.getDrawable(0x7f020222);
        resources.setBounds(0, 0, resources.getIntrinsicWidth(), resources.getIntrinsicHeight());
        return new dth(resources);
    }

}
