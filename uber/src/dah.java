// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.FragmentActivity;
import com.ubercab.client.core.contacts.SelectContactsFragment;
import com.ubercab.client.core.ui.ChipEditText;

public final class dah extends hpb
{

    final SelectContactsFragment a;

    private dah(SelectContactsFragment selectcontactsfragment)
    {
        a = selectcontactsfragment;
        super();
    }

    public dah(SelectContactsFragment selectcontactsfragment, byte byte0)
    {
        this(selectcontactsfragment);
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        SelectContactsFragment.a(a, a.mInviteesEditText.c());
        a.getActivity().invalidateOptionsMenu();
    }
}
