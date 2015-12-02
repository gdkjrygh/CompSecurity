// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.client.core.ui.ToggleButton;

public final class ean
    implements dtc, eam
{

    private ToggleButton a;

    public ean()
    {
    }

    private void a()
    {
        a.a(this);
        a.c("uberPOOL");
        a.e("uberX");
        a.b("SAVE 15% MONEY");
        a.d("SAVE 30% TIME");
        a.a("Switch to POOL to save more!");
        a.a();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        a = (ToggleButton)layoutinflater.inflate(0x7f0301b4, viewgroup, false);
        a();
        return a;
    }
}
