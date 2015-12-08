// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text.standalonecreditcard;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.contextlogic.wish.util.CreditCardUtil;

// Referenced classes of package com.contextlogic.wish.ui.components.text.standalonecreditcard:
//            StandaloneCreditCardBaseEditText, StandaloneCreditCardFieldsDelegate

public class StandaloneSecurityCodeEditText extends StandaloneCreditCardBaseEditText
{

    private com.contextlogic.wish.util.CreditCardUtil.CardType cardType;
    private StandaloneCreditCardFieldsDelegate _flddelegate;
    private int length;

    public StandaloneSecurityCodeEditText(Context context)
    {
        super(context);
        init();
    }

    public StandaloneSecurityCodeEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public StandaloneSecurityCodeEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void onSecurityCodeValid()
    {
        if (_flddelegate != null)
        {
            _flddelegate.onEntryComplete();
        }
    }

    public void afterTextChanged(Editable editable)
    {
        if (cardType != null && editable.toString().length() == length)
        {
            onSecurityCodeValid();
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public com.contextlogic.wish.util.CreditCardUtil.CardType getCardType()
    {
        return cardType;
    }

    public StandaloneCreditCardFieldsDelegate getDelegate()
    {
        return _flddelegate;
    }

    public void init()
    {
        super.init();
        setHint(getContext().getString(0x7f0600d1));
        setBackgroundResource(0x7f02019a);
        setTextSize(1, 13F);
        setGravity(19);
    }

    public boolean isValid()
    {
        String s;
        if (getText() != null)
        {
            s = getText().toString();
        } else
        {
            s = "";
        }
        if (cardType == null) goto _L2; else goto _L1
_L1:
        if (s.length() != length) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (s.length() <= 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void setCardType(com.contextlogic.wish.util.CreditCardUtil.CardType cardtype)
    {
        cardType = cardtype;
        length = CreditCardUtil.getValidSecurityCodeLength(cardtype);
        setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(length)
        });
    }

    public void setDelegate(StandaloneCreditCardFieldsDelegate standalonecreditcardfieldsdelegate)
    {
        _flddelegate = standalonecreditcardfieldsdelegate;
    }
}
