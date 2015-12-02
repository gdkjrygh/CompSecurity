// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.os.Handler;
import dsk;
import hpb;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.ui:
//            DiscreteCharacterInputLayout

final class a extends hpb
{

    final DiscreteCharacterInputLayout a;

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence.length() == 1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (DiscreteCharacterInputLayout.a(a) < DiscreteCharacterInputLayout.b(a).size() - 1)
        {
            DiscreteCharacterInputLayout.a(a, DiscreteCharacterInputLayout.a(a) + 1);
            return;
        }
        switch (DiscreteCharacterInputLayout.c(a))
        {
        default:
            return;

        case 0: // '\0'
            charsequence = DiscreteCharacterInputLayout.d(a).iterator();
            while (charsequence.hasNext()) 
            {
                ((dsk)charsequence.next()).i_();
            }
            break;

        case 1: // '\001'
            DiscreteCharacterInputLayout.f(a).postDelayed(new Runnable() {

                final DiscreteCharacterInputLayout._cls1 a;

                public final void run()
                {
                    DiscreteCharacterInputLayout.e(a.a);
                }

            
            {
                a = DiscreteCharacterInputLayout._cls1.this;
                super();
            }
            }, 500L);
            charsequence = DiscreteCharacterInputLayout.d(a).iterator();
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (charsequence.hasNext()) 
        {
            ((dsk)charsequence.next()).h_();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    _cls1.a(DiscreteCharacterInputLayout discretecharacterinputlayout)
    {
        a = discretecharacterinputlayout;
        super();
    }
}
