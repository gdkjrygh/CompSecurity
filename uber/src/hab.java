// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class hab
{

    private Bundle a;
    private gzs b;

    public hab(int i, int j)
    {
        a = new Bundle();
        if (i > 0 && j > 0)
        {
            a.putInt("camera_view_fragment.bundle.max_out_width", i);
            a.putInt("camera_view_fragment.bundle.max_out_heigth", j);
            return;
        } else
        {
            throw new IllegalArgumentException("maxWidth and maxHeight must be greater than zero.");
        }
    }

    public final hab a()
    {
        a.putInt("camera_view_fragment.bundle.color", -1);
        return this;
    }

    public final hab a(int i)
    {
        a.putInt("camera_view_fragment.bundle.jpeg_quality", i);
        return this;
    }

    public final hab a(gzs gzs)
    {
        b = gzs;
        return this;
    }

    public final hab a(gzz gzz)
    {
        a.putSerializable("camera_view_fragment.bundle.storage", gzz);
        return this;
    }

    public final hab a(hae hae)
    {
        a.putSerializable("camera_view_fragment.bundle.shape", hae);
        return this;
    }

    public final hab a(String s)
    {
        a.putString("camera_view_fragment.bundle.hint_text", s);
        return this;
    }

    public final hab a(boolean flag)
    {
        a.putBoolean("camera_view_fragment.bundle.should_use_renderscript", flag);
        return this;
    }

    public final haa b()
    {
        if (b == null)
        {
            throw new IllegalStateException("Please provide a CameraEventListener before building the Fragment.");
        } else
        {
            haa haa1 = new haa();
            haa1.a(b);
            haa1.setArguments(a);
            b = null;
            return haa1;
        }
    }

    public final hab b(String s)
    {
        a.putString("camera_view_fragment.bundle.review_hint_text", s);
        return this;
    }
}
