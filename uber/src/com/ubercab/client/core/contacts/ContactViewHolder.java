// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.contacts;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cgh;
import cgt;
import com.ubercab.ui.TextView;

// Referenced classes of package com.ubercab.client.core.contacts:
//            Contact

public class ContactViewHolder
{

    private final cgh a;
    private final Context b;
    private final boolean c;
    private final boolean d;
    public CheckBox mCheckBoxIsInvited;
    public ImageView mImageViewPicture;
    public TextView mTextViewDetails;
    public TextView mTextViewName;

    public ContactViewHolder(View view, cgh cgh1, boolean flag, boolean flag1, boolean flag2)
    {
        d = flag1;
        c = flag2;
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

    public final void a(Contact contact, boolean flag, boolean flag1)
    {
        if (contact == null)
        {
            return;
        }
        String s1 = contact.b();
        String s2 = contact.a(b);
        String s;
        if (contact.c() != null)
        {
            s = contact.c().toString();
        } else
        {
            s = null;
        }
        mTextViewName.setText(contact.a());
        if (d && !c)
        {
            s1 = String.format("%s %s", new Object[] {
                s1, s2
            });
            mTextViewDetails.setText(s1);
        }
        if (c)
        {
            mTextViewDetails.setText(contact.d());
        }
        if (flag1)
        {
            mCheckBoxIsInvited.setChecked(false);
            mCheckBoxIsInvited.setEnabled(false);
            mCheckBoxIsInvited.setVisibility(8);
            mTextViewDetails.setText(0x7f0703fe);
        } else
        {
            mCheckBoxIsInvited.setChecked(flag);
            mCheckBoxIsInvited.setEnabled(true);
            mCheckBoxIsInvited.setVisibility(0);
        }
        if (!TextUtils.isEmpty(s))
        {
            a.a(s).a(0x7f02006f).b(0x7f02006f).a(mImageViewPicture);
            return;
        } else
        {
            mImageViewPicture.setImageResource(0x7f02006f);
            return;
        }
    }
}
