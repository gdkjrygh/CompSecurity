// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text.standalonecreditcard;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.contextlogic.wish.ui.components.text.standalonecreditcard:
//            StandaloneCreditCardBaseEditText, StandaloneCreditCardFieldsDelegate

public class StandaloneExpiryDateEditText extends StandaloneCreditCardBaseEditText
{

    private StandaloneCreditCardFieldsDelegate _flddelegate;
    String previousString;

    public StandaloneExpiryDateEditText(Context context)
    {
        super(context);
        init();
    }

    public StandaloneExpiryDateEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public StandaloneExpiryDateEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private String getFormattedExpirationDate(String s)
    {
        Object obj = s;
        s.length();
        JVM INSTR tableswitch 1 5: default 327
    //                   1 55
    //                   2 90
    //                   3 136
    //                   4 186
    //                   5 223;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (s.length() > 5)
        {
            return s.substring(0, 5);
        }
          goto _L7
_L2:
        if (Integer.parseInt(s) < 2)
        {
            return s;
        }
        return (new StringBuilder()).append("0").append(s).append("/").toString();
_L3:
        int i = Integer.parseInt(s);
        if (i <= 12 && i >= 1) goto _L9; else goto _L8
_L8:
        return s.substring(0, 1);
_L9:
        return (new StringBuilder()).append(s).append("/").toString();
_L4:
        if (s.substring(2, 3).equalsIgnoreCase("/"))
        {
            return s;
        }
        obj = (new StringBuilder()).append(s.substring(0, 2)).append("/").append(s.substring(2, 3)).toString();
_L5:
        if (Integer.parseInt(((String) (obj)).substring(3, 4)) < Integer.parseInt(String.valueOf(Calendar.getInstance().get(1)).substring(2, 3)))
        {
            return ((String) (obj)).substring(0, 3);
        }
        break; /* Loop/switch isn't completed */
_L6:
        Calendar calendar;
        obj = new SimpleDateFormat("MM/yyyy", Locale.US);
        ((SimpleDateFormat) (obj)).setLenient(false);
        obj = ((SimpleDateFormat) (obj)).parse((new StringBuilder()).append(s.substring(0, 3)).append("20").append(s.substring(3)).toString());
        calendar = Calendar.getInstance();
        calendar.setTime(((Date) (obj)));
        calendar.add(2, 1);
        if (calendar.getTime().after(new Date()))
        {
            return s;
        }
        try
        {
            s = s.substring(0, 4);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
_L7:
        return s;
        return ((String) (obj));
    }

    private void onBadInput()
    {
        startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040008));
        setTextColor(0xffff0000);
        (new Handler()).postDelayed(new Runnable() {

            final StandaloneExpiryDateEditText this$0;

            public void run()
            {
                setTextColor(getResources().getColor(0x7f0c00b7));
            }

            
            {
                this$0 = StandaloneExpiryDateEditText.this;
                super();
            }
        }, 300L);
    }

    private void onExpirationDateValid()
    {
        if (_flddelegate != null)
        {
            _flddelegate.onEntryComplete();
        }
    }

    public void afterTextChanged(Editable editable)
    {
        String s = editable.toString();
        if (s.length() <= previousString.length()) goto _L2; else goto _L1
_L1:
        removeTextChangedListener(this);
        editable = getFormattedExpirationDate(editable.toString());
        setText(editable);
        setSelection(editable.length());
        addTextChangedListener(this);
        if (editable.length() != 5) goto _L4; else goto _L3
_L3:
        onExpirationDateValid();
        setValid(true);
_L6:
        return;
_L4:
        if (editable.length() < s.length())
        {
            onBadInput();
            setValid(false);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.length() < 5)
        {
            setValid(false);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        previousString = charsequence.toString();
    }

    public StandaloneCreditCardFieldsDelegate getDelegate()
    {
        return _flddelegate;
    }

    public void init()
    {
        super.init();
        setHint(getContext().getString(0x7f0600d0));
        setBackgroundResource(0x7f02019a);
        setTextSize(1, 13F);
        setGravity(19);
    }

    public void setDelegate(StandaloneCreditCardFieldsDelegate standalonecreditcardfieldsdelegate)
    {
        _flddelegate = standalonecreditcardfieldsdelegate;
    }
}
