// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.faresplit.master;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cgh;
import cgt;
import com.ubercab.client.core.contacts.Contact;
import com.ubercab.rider.realtime.model.RecentFareSplitter;
import com.ubercab.ui.TextView;
import duj;
import dun;

public class FareSplitContactViewHolder
    implements android.view.View.OnClickListener
{

    private final cgh a;
    private Context b;
    private TextView c;
    CheckBox mCheckBoxIsInvited;
    ImageView mImageViewPicture;
    ViewStub mLinkViewStub;
    TextView mTextViewName;
    TextView mTextViewNumber;

    public FareSplitContactViewHolder(View view, cgh cgh1, boolean flag)
    {
        b = view.getContext();
        a = cgh1;
        ButterKnife.inject(this, view);
        view = mCheckBoxIsInvited;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void a(Contact contact, boolean flag, boolean flag1, boolean flag2)
    {
        if (contact == null)
        {
            return;
        }
        String s1 = String.format("%s %s", new Object[] {
            contact.b(), contact.a(b)
        });
        String s;
        if (contact.c() != null)
        {
            s = contact.c().toString();
        } else
        {
            s = null;
        }
        mTextViewName.setText(contact.a());
        if (flag1)
        {
            mTextViewNumber.setVisibility(0);
            if (c != null)
            {
                c.setVisibility(8);
            }
            mTextViewNumber.setText(s1);
        } else
        {
            mTextViewNumber.setVisibility(8);
            if (mLinkViewStub != null && mLinkViewStub.getParent() != null)
            {
                c = (TextView)mLinkViewStub.inflate();
                c.setOnClickListener(this);
                mLinkViewStub = null;
                c.setVisibility(0);
                c.setText(s1);
            }
        }
        if (!TextUtils.isEmpty(s))
        {
            a.a(s).a(0x7f02006f).b(0x7f02006f).a(mImageViewPicture);
        } else
        {
            mImageViewPicture.setImageResource(0x7f02006f);
        }
        if (flag2 != mCheckBoxIsInvited.isChecked())
        {
            contact = mCheckBoxIsInvited;
            int i;
            if (flag2)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            contact.setVisibility(i);
        }
        mCheckBoxIsInvited.setChecked(flag);
    }

    public final void a(RecentFareSplitter recentfaresplitter, boolean flag)
    {
        mTextViewName.setText(recentfaresplitter.getName());
        String s1 = recentfaresplitter.getMobileDigits();
        String s2 = recentfaresplitter.getMobileCountryIso2();
        Object obj = null;
        String s = obj;
        if (!TextUtils.isEmpty(s1))
        {
            s = obj;
            if (!TextUtils.isEmpty(s2))
            {
                s = duj.b(s1, s2);
            }
        }
        mTextViewNumber.setText(s);
        mCheckBoxIsInvited.setChecked(flag);
        if (!TextUtils.isEmpty(recentfaresplitter.getPictureUrl()))
        {
            a.a(recentfaresplitter.getPictureUrl()).a(0x7f02006f).b(0x7f02006f).a(mImageViewPicture);
            return;
        } else
        {
            mImageViewPicture.setImageResource(0x7f02006f);
            return;
        }
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0e0186)
        {
            dun.a(b);
        }
    }
}
