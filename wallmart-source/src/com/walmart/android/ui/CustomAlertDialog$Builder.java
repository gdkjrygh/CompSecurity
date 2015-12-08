// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.walmart.android.ui.dialog.AlertDialog;

// Referenced classes of package com.walmart.android.ui:
//            CustomAlertDialog

public static class ation.dialogThemeId
{

    private final com.walmart.android.ui.dialog.r mBuilder;
    private ation mConfiguration;
    private final ContextThemeWrapper mContext;
    private TextView mTitle;

    private void initTitle()
    {
        if (mTitle == null)
        {
            View view = View.inflate(mContext, mConfiguration.titleLayoutId, null);
            mTitle = (TextView)view.findViewById(mConfiguration.titleTextId);
            mBuilder.tomTitle(view);
        }
    }

    public AlertDialog create()
    {
        return mBuilder.();
    }

    public .create setAdapter(ListAdapter listadapter, android.content.tener tener)
    {
        mBuilder.pter(listadapter, tener);
        return this;
    }

    public .setAdapter setCancelable(boolean flag)
    {
        mBuilder.celable(flag);
        return this;
    }

    public .setCancelable setIcon(int i)
    {
        initTitle();
        mTitle.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        return this;
    }

    public ntrinsicBounds setIcon(Drawable drawable)
    {
        initTitle();
        mTitle.setCompoundDrawables(drawable, null, null, null);
        return this;
    }

    public mTitle setItems(CharSequence acharsequence[], android.content.tener tener)
    {
        mBuilder.ms(acharsequence, tener);
        return this;
    }

    public .setItems setMessage(int i)
    {
        return setMessage(((CharSequence) (mContext.getString(i))));
    }

    public mContext setMessage(CharSequence charsequence)
    {
        View view = View.inflate(mContext, mConfiguration.messageLayoutid, null);
        TextView textview = (TextView)view.findViewById(mConfiguration.messageTextId);
        mBuilder.w(view);
        textview.setText(charsequence);
        return this;
    }

    public kListener setMultiChoiceItems(int i, boolean aflag[], android.content.iceClickListener iceclicklistener)
    {
        mBuilder.tiChoiceItems(i, aflag, iceclicklistener);
        return this;
    }

    public kListener setMultiChoiceItems(Cursor cursor, String s, String s1, android.content.iceClickListener iceclicklistener)
    {
        mBuilder.tiChoiceItems(cursor, s, s1, iceclicklistener);
        return this;
    }

    public kListener setMultiChoiceItems(CharSequence acharsequence[], boolean aflag[], android.content.iceClickListener iceclicklistener)
    {
        mBuilder.tiChoiceItems(acharsequence, aflag, iceclicklistener);
        return this;
    }

    public kListener setNegativeButton(int i, android.content.tener tener)
    {
        mBuilder.ativeButton(i, tener);
        return this;
    }

    public .setNegativeButton setNegativeButton(String s, android.content.tener tener)
    {
        mBuilder.ativeButton(s, tener);
        return this;
    }

    public .setNegativeButton setNeutralButton(int i, android.content.tener tener)
    {
        mBuilder.tralButton(i, tener);
        return this;
    }

    public .setNeutralButton setNeutralButton(String s, android.content.tener tener)
    {
        mBuilder.tralButton(s, tener);
        return this;
    }

    public .setNeutralButton setOnCancelListener(android.content.stener stener)
    {
        mBuilder.ancelListener(stener);
        return this;
    }

    public  setOnDismissListener(android.content.istener istener)
    {
        mBuilder.ismissListener(istener);
        return this;
    }

    public  setPositiveButton(int i, android.content.tener tener)
    {
        mBuilder.itiveButton(i, tener);
        return this;
    }

    public .setPositiveButton setPositiveButton(CharSequence charsequence, android.content.tener tener)
    {
        mBuilder.itiveButton(charsequence, tener);
        return this;
    }

    public .setPositiveButton setSingleChoiceItems(int i, int j, android.content.tener tener)
    {
        mBuilder.gleChoiceItems(i, j, tener);
        return this;
    }

    public .setSingleChoiceItems setSingleChoiceItems(ListAdapter listadapter, int i, android.content.tener tener)
    {
        mBuilder.gleChoiceItems(listadapter, i, tener);
        return this;
    }

    public .setSingleChoiceItems setSingleChoiceItems(CharSequence acharsequence[], int i, android.content.tener tener)
    {
        mBuilder.gleChoiceItems(acharsequence, i, tener);
        return this;
    }

    public .setSingleChoiceItems setTitle(int i)
    {
        return setTitle(((CharSequence) (mContext.getString(i))));
    }

    public mContext setTitle(CharSequence charsequence)
    {
        initTitle();
        mTitle.setText(charsequence);
        return this;
    }

    public mTitle setView(View view)
    {
        mBuilder.w(view);
        return this;
    }

    public AlertDialog show()
    {
        return mBuilder.r();
    }

    public ation(Context context)
    {
        this(context, 0);
    }

    public <init>(Context context, int i)
    {
        mConfiguration = (ation)CustomAlertDialog.access$000().get(i);
        context = new ContextThemeWrapper(context, mConfiguration.dialogThemeId);
        mContext = context;
        mBuilder = new com.walmart.android.ui.dialog.(context, mConfiguration.dialogThemeId);
    }

    public ation(Context context, ation ation)
    {
        mConfiguration = ation;
        context = new ContextThemeWrapper(context, mConfiguration.dialogThemeId);
        mContext = context;
        mBuilder = new com.walmart.android.ui.dialog.(context, mConfiguration.dialogThemeId);
    }
}
