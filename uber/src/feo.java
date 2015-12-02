// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.ubercab.client.core.contacts.ContactViewHolder;
import com.ubercab.client.core.model.SafetyNetContact;
import com.ubercab.ui.TextView;

final class feo extends ContactViewHolder
{

    final fen a;

    public feo(fen fen, View view, cgh cgh)
    {
        a = fen;
        super(view, cgh, true, true, false);
    }

    public final void a(SafetyNetContact safetynetcontact)
    {
        if (safetynetcontact == null)
        {
            return;
        } else
        {
            mTextViewName.setText(safetynetcontact.getName());
            mTextViewDetails.setText(duj.a(safetynetcontact.getPhone()));
            mCheckBoxIsInvited.setChecked(true);
            mImageViewPicture.setImageResource(0x7f02006f);
            return;
        }
    }
}
