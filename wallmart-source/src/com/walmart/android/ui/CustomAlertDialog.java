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

public final class CustomAlertDialog
{
    public static class Builder
    {

        private final com.walmart.android.ui.dialog.AlertDialog.Builder mBuilder;
        private Configuration mConfiguration;
        private final ContextThemeWrapper mContext;
        private TextView mTitle;

        private void initTitle()
        {
            if (mTitle == null)
            {
                View view = View.inflate(mContext, mConfiguration.titleLayoutId, null);
                mTitle = (TextView)view.findViewById(mConfiguration.titleTextId);
                mBuilder.setCustomTitle(view);
            }
        }

        public AlertDialog create()
        {
            return mBuilder.create();
        }

        public Builder setAdapter(ListAdapter listadapter, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setAdapter(listadapter, onclicklistener);
            return this;
        }

        public Builder setCancelable(boolean flag)
        {
            mBuilder.setCancelable(flag);
            return this;
        }

        public Builder setIcon(int i)
        {
            initTitle();
            mTitle.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            return this;
        }

        public Builder setIcon(Drawable drawable)
        {
            initTitle();
            mTitle.setCompoundDrawables(drawable, null, null, null);
            return this;
        }

        public Builder setItems(CharSequence acharsequence[], android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setItems(acharsequence, onclicklistener);
            return this;
        }

        public Builder setMessage(int i)
        {
            return setMessage(((CharSequence) (mContext.getString(i))));
        }

        public Builder setMessage(CharSequence charsequence)
        {
            View view = View.inflate(mContext, mConfiguration.messageLayoutid, null);
            TextView textview = (TextView)view.findViewById(mConfiguration.messageTextId);
            mBuilder.setView(view);
            textview.setText(charsequence);
            return this;
        }

        public Builder setMultiChoiceItems(int i, boolean aflag[], android.content.DialogInterface.OnMultiChoiceClickListener onmultichoiceclicklistener)
        {
            mBuilder.setMultiChoiceItems(i, aflag, onmultichoiceclicklistener);
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String s, String s1, android.content.DialogInterface.OnMultiChoiceClickListener onmultichoiceclicklistener)
        {
            mBuilder.setMultiChoiceItems(cursor, s, s1, onmultichoiceclicklistener);
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence acharsequence[], boolean aflag[], android.content.DialogInterface.OnMultiChoiceClickListener onmultichoiceclicklistener)
        {
            mBuilder.setMultiChoiceItems(acharsequence, aflag, onmultichoiceclicklistener);
            return this;
        }

        public Builder setNegativeButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setNegativeButton(i, onclicklistener);
            return this;
        }

        public Builder setNegativeButton(String s, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setNegativeButton(s, onclicklistener);
            return this;
        }

        public Builder setNeutralButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setNeutralButton(i, onclicklistener);
            return this;
        }

        public Builder setNeutralButton(String s, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setNeutralButton(s, onclicklistener);
            return this;
        }

        public Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener oncancellistener)
        {
            mBuilder.setOnCancelListener(oncancellistener);
            return this;
        }

        public Builder setOnDismissListener(android.content.DialogInterface.OnDismissListener ondismisslistener)
        {
            mBuilder.setOnDismissListener(ondismisslistener);
            return this;
        }

        public Builder setPositiveButton(int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setPositiveButton(i, onclicklistener);
            return this;
        }

        public Builder setPositiveButton(CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setPositiveButton(charsequence, onclicklistener);
            return this;
        }

        public Builder setSingleChoiceItems(int i, int j, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setSingleChoiceItems(i, j, onclicklistener);
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listadapter, int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setSingleChoiceItems(listadapter, i, onclicklistener);
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence acharsequence[], int i, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            mBuilder.setSingleChoiceItems(acharsequence, i, onclicklistener);
            return this;
        }

        public Builder setTitle(int i)
        {
            return setTitle(((CharSequence) (mContext.getString(i))));
        }

        public Builder setTitle(CharSequence charsequence)
        {
            initTitle();
            mTitle.setText(charsequence);
            return this;
        }

        public Builder setView(View view)
        {
            mBuilder.setView(view);
            return this;
        }

        public AlertDialog show()
        {
            return mBuilder.show();
        }

        public Builder(Context context)
        {
            this(context, 0);
        }

        public Builder(Context context, int i)
        {
            mConfiguration = (Configuration)CustomAlertDialog.sConfigs.get(i);
            context = new ContextThemeWrapper(context, mConfiguration.dialogThemeId);
            mContext = context;
            mBuilder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context, mConfiguration.dialogThemeId);
        }

        public Builder(Context context, Configuration configuration)
        {
            mConfiguration = configuration;
            context = new ContextThemeWrapper(context, mConfiguration.dialogThemeId);
            mContext = context;
            mBuilder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context, mConfiguration.dialogThemeId);
        }
    }

    public static class Configuration
    {

        public int dialogThemeId;
        public int messageLayoutid;
        public int messageTextId;
        public int titleLayoutId;
        public int titleTextId;

        public Configuration(int i, int j, int k, int l, int i1)
        {
            dialogThemeId = i;
            titleLayoutId = j;
            titleTextId = k;
            messageLayoutid = l;
            messageTextId = i1;
        }
    }


    public static final int CONFIG_DEFAULT = 0;
    private static final SparseArray sConfigs = new SparseArray();

    public CustomAlertDialog()
    {
    }

    public static void configure(int i, int j, int k, int l, int i1)
    {
        configure(0, new Configuration(i, j, k, l, i1));
    }

    public static void configure(int i, Configuration configuration)
    {
        sConfigs.put(i, configuration);
    }


}
