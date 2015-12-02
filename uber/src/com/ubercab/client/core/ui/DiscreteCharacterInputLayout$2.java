// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.ui:
//            DiscreteCharacterInputLayout

final class a
    implements android.view.InputLayout._cls2
{

    final DiscreteCharacterInputLayout a;

    public final boolean onKey(View view, int i, KeyEvent keyevent)
    {
        view = ((EditText)DiscreteCharacterInputLayout.b(a).get(DiscreteCharacterInputLayout.a(a))).getText();
        if (keyevent.getAction() == 0 && i == 67 && DiscreteCharacterInputLayout.a(a) > 0 && view.length() == 0)
        {
            DiscreteCharacterInputLayout.a(a, DiscreteCharacterInputLayout.a(a) - 1);
            ((EditText)DiscreteCharacterInputLayout.b(a).get(DiscreteCharacterInputLayout.a(a))).setText("");
            return true;
        } else
        {
            return false;
        }
    }

    (DiscreteCharacterInputLayout discretecharacterinputlayout)
    {
        a = discretecharacterinputlayout;
        super();
    }
}
