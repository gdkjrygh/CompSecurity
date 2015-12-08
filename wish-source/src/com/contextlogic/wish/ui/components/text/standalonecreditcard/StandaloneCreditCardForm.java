// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text.standalonecreditcard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.contextlogic.wish.testing.WishTestingUtil;
import com.contextlogic.wish.util.BitmapUtil;

// Referenced classes of package com.contextlogic.wish.ui.components.text.standalonecreditcard:
//            StandaloneCreditCardEditTextDelegate, StandaloneCreditCardEditText, StandaloneCreditCardFieldsDelegate

public class StandaloneCreditCardForm extends FrameLayout
    implements StandaloneCreditCardEditTextDelegate
{

    private ImageView cardImageView;
    private StandaloneCreditCardEditText creditCardEditText;
    private StandaloneCreditCardFieldsDelegate _flddelegate;

    public StandaloneCreditCardForm(Context context)
    {
        super(context);
        init();
    }

    public StandaloneCreditCardForm(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public StandaloneCreditCardForm(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static int cardImageForCardType(com.contextlogic.wish.util.CreditCardUtil.CardType cardtype)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType = new int[com.contextlogic.wish.util.CreditCardUtil.CardType.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.Amex.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.Discover.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.MasterCard.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.Visa.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.DinersClub.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[com.contextlogic.wish.util.CreditCardUtil.CardType.HiperCard.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.contextlogic.wish.util.CreditCardUtil.CardType[cardtype.ordinal()])
        {
        default:
            return 0x7f020146;

        case 1: // '\001'
            return 0x7f02003b;

        case 2: // '\002'
            return 0x7f0200a5;

        case 3: // '\003'
            return 0x7f020145;

        case 4: // '\004'
            return 0x7f0201ae;

        case 5: // '\005'
            return 0x7f0200a4;

        case 6: // '\006'
            return 0x7f0200de;
        }
    }

    public com.contextlogic.wish.util.CreditCardUtil.CardType getCardType()
    {
        return creditCardEditText.getCardType();
    }

    public StandaloneCreditCardFieldsDelegate getDelegate()
    {
        return _flddelegate;
    }

    public String getText()
    {
        return creditCardEditText.getText().toString();
    }

    public void init()
    {
        int i = (int)TypedValue.applyDimension(1, 45, getResources().getDisplayMetrics());
        int j = (int)TypedValue.applyDimension(1, 35F, getResources().getDisplayMetrics());
        LinearLayout linearlayout = new LinearLayout(getContext());
        linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearlayout.setOrientation(0);
        creditCardEditText = new StandaloneCreditCardEditText(getContext());
        Object obj = new android.widget.LinearLayout.LayoutParams(0, j, 1.0F);
        obj.gravity = 17;
        creditCardEditText.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        creditCardEditText.setDelegate(this);
        WishTestingUtil.addContentDescription(creditCardEditText, getClass().getSimpleName(), "creditCardEditText");
        linearlayout.addView(creditCardEditText);
        obj = new FrameLayout(getContext());
        ((FrameLayout) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, j));
        ((FrameLayout) (obj)).setBackgroundResource(0x7f020047);
        cardImageView = new ImageView(getContext());
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 17;
        cardImageView.setLayoutParams(layoutparams);
        cardImageView.setImageResource(0x7f020146);
        ((FrameLayout) (obj)).addView(cardImageView);
        linearlayout.addView(((android.view.View) (obj)));
        setBackgroundResource(0x7f020199);
        creditCardEditText.setTextSize(1, 13F);
        addView(linearlayout);
    }

    public boolean isValid()
    {
        return creditCardEditText.isValid();
    }

    public void onCardTypeChange(com.contextlogic.wish.util.CreditCardUtil.CardType cardtype)
    {
        BitmapUtil.safeSetImageResource(cardImageView, cardImageForCardType(cardtype));
        if (_flddelegate != null)
        {
            _flddelegate.onCardTypeChanged(cardtype);
        }
    }

    public void onCreditCardNumberValid()
    {
        if (_flddelegate != null)
        {
            _flddelegate.onEntryComplete();
        }
    }

    public void setDelegate(StandaloneCreditCardFieldsDelegate standalonecreditcardfieldsdelegate)
    {
        _flddelegate = standalonecreditcardfieldsdelegate;
    }
}
