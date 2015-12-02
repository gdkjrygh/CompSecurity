// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;
import com.ubercab.ui.TextView;

final class dax
{

    private ImageView a;
    private TextView b;

    private dax()
    {
    }

    dax(byte byte0)
    {
        this();
    }

    static ImageView a(dax dax1)
    {
        return dax1.a;
    }

    static ImageView a(dax dax1, ImageView imageview)
    {
        dax1.a = imageview;
        return imageview;
    }

    static TextView a(dax dax1, TextView textview)
    {
        dax1.b = textview;
        return textview;
    }

    static TextView b(dax dax1)
    {
        return dax1.b;
    }
}
