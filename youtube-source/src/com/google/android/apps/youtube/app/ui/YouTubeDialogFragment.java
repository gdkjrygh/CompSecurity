// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.google.android.apps.youtube.common.L;

public class YouTubeDialogFragment extends DialogFragment
{

    public YouTubeDialogFragment()
    {
    }

    public final void d(Bundle bundle)
    {
        try
        {
            super.d(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            L.a("Got 'expected' NullPointerException", bundle);
        }
    }
}
