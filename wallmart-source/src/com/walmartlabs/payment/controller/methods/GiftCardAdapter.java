// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.methods;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class GiftCardAdapter extends BasicAdapter
{
    public static interface GiftCardCheckedChangedListener
    {

        public abstract void onGiftCardCheckedChanged(int i, boolean flag);
    }

    public static class GiftCardViewHolder extends BasicViewHolder
    {

        public final TextView cardBalance;
        public final TextView cardDigits;
        public final ImageView cardImage;
        public final TextView cardName;
        public final SwitchCompat cardSwitch;

        public GiftCardViewHolder(View view)
        {
            super(view);
            cardImage = (ImageView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_gc_icon);
            cardDigits = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_gc_digits);
            cardName = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_gc_name);
            cardBalance = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_gc_balance);
            cardSwitch = (SwitchCompat)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_gc_switch);
        }
    }


    private final Context mContext;
    private GiftCardCheckedChangedListener mGiftCardCheckedChangedListener;
    private final String mGiftCardFormatter;
    private final String mGiftCardLabel;
    protected List mGiftCards;
    private Map mOptOutState;

    public GiftCardAdapter(Context context)
    {
        mOptOutState = new HashMap();
        mContext = context;
        mGiftCardLabel = mContext.getResources().getString(com.walmartlabs.android.payment.R.string.pm_loaded_gift_card_label);
        mGiftCardFormatter = mContext.getResources().getString(com.walmartlabs.android.payment.R.string.pm_bullets_and_lastfour);
    }

    public GiftCard getItem(int i)
    {
        return (GiftCard)mGiftCards.get(i);
    }

    public int getItemCount()
    {
        if (mGiftCards == null)
        {
            return 0;
        } else
        {
            return mGiftCards.size();
        }
    }

    public List getItems()
    {
        return mGiftCards;
    }

    public Map getOptOutState()
    {
        return mOptOutState;
    }

    public boolean hasEnabledGiftCards()
    {
        for (Iterator iterator = mOptOutState.entrySet().iterator(); iterator.hasNext();)
        {
            if (!((Boolean)((java.util.Map.Entry)iterator.next()).getValue()).booleanValue())
            {
                return true;
            }
        }

        return false;
    }

    public GiftCardViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new GiftCardViewHolder(LayoutInflater.from(mContext).inflate(com.walmartlabs.android.payment.R.layout.pm_list_item_gc, viewgroup, false));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(GiftCardViewHolder giftcardviewholder, final int position)
    {
        final GiftCard giftCard = (GiftCard)mGiftCards.get(position);
        if (giftCard != null)
        {
            if (giftcardviewholder.cardName != null)
            {
                TextView textview = giftcardviewholder.cardName;
                Object obj;
                if (giftCard.label != null && !giftCard.label.isEmpty())
                {
                    obj = giftCard.label;
                } else
                {
                    obj = mGiftCardLabel;
                }
                textview.setText(((CharSequence) (obj)));
            }
            if (giftcardviewholder.cardBalance != null)
            {
                giftcardviewholder.cardBalance.setText(NumberFormat.getCurrencyInstance(Locale.US).format(giftCard.balance));
            }
            if (giftcardviewholder.cardDigits != null)
            {
                giftcardviewholder.cardDigits.setText(String.format(mGiftCardFormatter, new Object[] {
                    giftCard.lastFour
                }));
            }
            if (giftcardviewholder.cardSwitch != null)
            {
                obj = giftcardviewholder.cardSwitch;
                boolean flag;
                if (!giftCard.optOut)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((SwitchCompat) (obj)).setChecked(flag);
                giftcardviewholder.cardSwitch.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                    final GiftCardAdapter this$0;
                    final GiftCard val$giftCard;
                    final int val$position;

                    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
                    {
                        compoundbutton = mOptOutState;
                        String s = giftCard.id;
                        boolean flag2;
                        if (!flag1)
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        compoundbutton.put(s, Boolean.valueOf(flag2));
                        if (mGiftCardCheckedChangedListener != null)
                        {
                            mGiftCardCheckedChangedListener.onGiftCardCheckedChanged(position, flag1);
                        }
                    }

            
            {
                this$0 = GiftCardAdapter.this;
                giftCard = giftcard;
                position = i;
                super();
            }
                });
            }
        }
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((GiftCardViewHolder)basicviewholder, i);
    }

    public void setGiftCardCheckedChangedListener(GiftCardCheckedChangedListener giftcardcheckedchangedlistener)
    {
        mGiftCardCheckedChangedListener = giftcardcheckedchangedlistener;
    }

    public void setGiftCards(List list)
    {
        mGiftCards = list;
        GiftCard giftcard;
        for (list = mGiftCards.iterator(); list.hasNext(); mOptOutState.put(giftcard.id, Boolean.valueOf(false)))
        {
            giftcard = (GiftCard)list.next();
        }

        notifyDataSetChanged();
    }


}
