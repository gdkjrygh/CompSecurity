// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//            MediaDescriptionCompat

public final class b
{

    private String a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private Bitmap e;
    private Uri f;
    private Bundle g;

    public b()
    {
    }

    public MediaDescriptionCompat a()
    {
        return new MediaDescriptionCompat(a, b, c, d, e, f, g, null);
    }

    public b a(Bitmap bitmap)
    {
        e = bitmap;
        return this;
    }

    public b a(Uri uri)
    {
        f = uri;
        return this;
    }

    public b a(Bundle bundle)
    {
        g = bundle;
        return this;
    }

    public b a(CharSequence charsequence)
    {
        b = charsequence;
        return this;
    }

    public b a(String s)
    {
        a = s;
        return this;
    }

    public b b(CharSequence charsequence)
    {
        c = charsequence;
        return this;
    }

    public b c(CharSequence charsequence)
    {
        d = charsequence;
        return this;
    }
}
