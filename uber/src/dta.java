// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public abstract class dta extends cyz
    implements android.content.DialogInterface.OnClickListener
{

    public dta()
    {
    }

    protected static Bundle a(String s, String s1, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putString("dialog.title", s);
        bundle.putString("dialog.message", s1);
        bundle.putInt("dialog.request_code", i);
        return bundle;
    }

    private String e()
    {
        if (getArguments() == null)
        {
            return "";
        } else
        {
            return getArguments().getString("dialog.title");
        }
    }

    private String f()
    {
        if (getArguments() == null)
        {
            return "";
        } else
        {
            return getArguments().getString("dialog.message");
        }
    }

    protected final AlertDialog d()
    {
        AlertDialog alertdialog = dtf.a(getActivity());
        alertdialog.setTitle(e());
        alertdialog.setMessage(f());
        alertdialog.setCancelable(true);
        return alertdialog;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dismiss();
    }
}
