// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text.standalonecreditcard;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import com.contextlogic.wish.util.CreditCardUtil;

// Referenced classes of package com.contextlogic.wish.ui.components.text.standalonecreditcard:
//            StandaloneCreditCardBaseEditText, StandaloneCreditCardEditTextDelegate

public class StandaloneCreditCardEditText extends StandaloneCreditCardBaseEditText
{

    private com.contextlogic.wish.util.CreditCardUtil.CardType cardType;
    private StandaloneCreditCardEditTextDelegate _flddelegate;
    private String previousNumber;

    public StandaloneCreditCardEditText(Context context)
    {
        super(context);
        init();
    }

    public StandaloneCreditCardEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public StandaloneCreditCardEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void onBadInput()
    {
        startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040008));
        setTextColor(0xffff0000);
        (new Handler()).postDelayed(new Runnable() {

            final StandaloneCreditCardEditText this$0;

            public void run()
            {
                setTextColor(getResources().getColor(0x7f0c00b7));
            }

            
            {
                this$0 = StandaloneCreditCardEditText.this;
                super();
            }
        }, 300L);
    }

    public void afterTextChanged(Editable editable)
    {
        editable = editable.toString();
        if (editable.length() >= 4)
        {
            com.contextlogic.wish.util.CreditCardUtil.CardType cardtype = CreditCardUtil.getCardType(editable);
            if (cardtype.equals(com.contextlogic.wish.util.CreditCardUtil.CardType.Invalid))
            {
                removeTextChangedListener(this);
                setText(previousNumber);
                setSelection(Math.min(3, getText().length()));
                addTextChangedListener(this);
                onBadInput();
                setValid(false);
            } else
            {
                if (cardType != cardtype && _flddelegate != null)
                {
                    _flddelegate.onCardTypeChange(cardtype);
                }
                cardType = cardtype;
                String s = CreditCardUtil.getFormattedCardNumber(editable, cardtype);
                if (!editable.equalsIgnoreCase(s))
                {
                    removeTextChangedListener(this);
                    setText(s);
                    setSelection(s.length());
                    addTextChangedListener(this);
                }
                if (cardtype != com.contextlogic.wish.util.CreditCardUtil.CardType.HiperCard && s.length() >= CreditCardUtil.getLengthOfFormattedString(cardtype))
                {
                    if (CreditCardUtil.isValidCardNumber(s))
                    {
                        if (_flddelegate != null)
                        {
                            _flddelegate.onCreditCardNumberValid();
                            return;
                        }
                    } else
                    {
                        onBadInput();
                        return;
                    }
                }
            }
        } else
        if (cardType != null)
        {
            cardType = null;
            if (_flddelegate != null)
            {
                _flddelegate.onCardTypeChange(com.contextlogic.wish.util.CreditCardUtil.CardType.Invalid);
                return;
            }
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        previousNumber = charsequence.toString();
    }

    public com.contextlogic.wish.util.CreditCardUtil.CardType getCardType()
    {
        return cardType;
    }

    public StandaloneCreditCardEditTextDelegate getDelegate()
    {
        return _flddelegate;
    }

    public void init()
    {
        super.init();
        setGravity(19);
        setHint(0x7f0600bf);
        setPadding((int)TypedValue.applyDimension(1, 6F, getResources().getDisplayMetrics()), 0, 0, 0);
    }

    public boolean isValid()
    {
        return CreditCardUtil.isValidCardNumber(getText().toString());
    }

    public void setDelegate(StandaloneCreditCardEditTextDelegate standalonecreditcardedittextdelegate)
    {
        _flddelegate = standalonecreditcardedittextdelegate;
    }
}
