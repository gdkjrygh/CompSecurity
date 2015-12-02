// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.locale.name.NameInput;
import com.ubercab.ui.FloatingLabelEditText;

public final class gox extends hpb
{

    final NameInput a;

    private gox(NameInput nameinput)
    {
        a = nameinput;
        super();
    }

    public gox(NameInput nameinput, byte byte0)
    {
        this(nameinput);
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (NameInput.a(a) == goy.a || NameInput.a(a) == goy.d) goto _L2; else goto _L1
_L1:
        if (NameInput.a(a) != goy.c) goto _L4; else goto _L3
_L3:
        if (TextUtils.isEmpty(NameInput.b(a).i()) && TextUtils.isEmpty(NameInput.d(a).i()))
        {
            NameInput.a(a, goy.b);
        }
_L2:
        if (NameInput.e(a) != null)
        {
            NameInput.e(a).a();
        }
        return;
_L4:
        if (NameInput.a(a) == goy.b)
        {
            charsequence = NameInput.b(a).i();
            if (!TextUtils.isEmpty(charsequence) && !gpp.a(charsequence.charAt(0)))
            {
                NameInput.a(a, goy.c);
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
