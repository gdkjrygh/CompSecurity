// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.model;

import com.walmartlabs.utils.WLog;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.payment.model:
//            CreditCard

public class CreditCardsModel
{
    public static class BillingAddress
    {

        public final String addressLineOne;
        public final String addressLineTwo;
        public final String city;
        public final String postalCode;
        public final String state;

        public boolean isSameBillingAddress(CreditCard creditcard)
        {
            return addressLineOne.equalsIgnoreCase(creditcard.getAddressLineOne()) && addressLineTwo.equalsIgnoreCase(creditcard.getAddressLineTwo()) && city.equalsIgnoreCase(creditcard.getCity()) && state.equalsIgnoreCase(creditcard.getState()) && postalCode.equalsIgnoreCase(creditcard.getPostalCode());
        }

        public BillingAddress(CreditCard creditcard)
        {
            addressLineOne = creditcard.getAddressLineOne();
            addressLineTwo = creditcard.getAddressLineTwo();
            city = creditcard.getCity();
            state = creditcard.getState();
            postalCode = creditcard.getPostalCode();
        }
    }


    public static final DateFormat EXPIRE_DATE;
    public static final DateFormat ISO_DATE;
    private static final String TAG = com/walmartlabs/payment/model/CreditCardsModel.getSimpleName();
    private static CreditCardsModel sInstance = new CreditCardsModel();
    private final List mBillingAddresses = new ArrayList();
    private final List mCreditCards = new ArrayList();
    private boolean mHasMobilePayData;

    private CreditCardsModel()
    {
    }

    public static String createExpiryDate(CreditCard creditcard)
    {
        if (creditcard == null || creditcard.getCardExpiryDate() == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        String s = EXPIRE_DATE.format(ISO_DATE.parse(creditcard.getCardExpiryDate()));
        return s;
        ParseException parseexception;
        parseexception;
        WLog.e(TAG, (new StringBuilder()).append("Failed to parse credit card date ").append(creditcard.getCardExpiryDate()).toString(), parseexception);
        return null;
    }

    public static CreditCardsModel get()
    {
        return sInstance;
    }

    private void updateBillingAddresses()
    {
        mBillingAddresses.clear();
        if (mCreditCards != null && !mCreditCards.isEmpty())
        {
            Iterator iterator = mCreditCards.iterator();
label0:
            do
            {
                CreditCard creditcard;
                boolean flag;
label1:
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    creditcard = (CreditCard)iterator.next();
                    boolean flag1 = false;
                    flag = flag1;
                    if (mBillingAddresses.isEmpty())
                    {
                        break label1;
                    }
                    Iterator iterator1 = mBillingAddresses.iterator();
                    do
                    {
                        flag = flag1;
                        if (!iterator1.hasNext())
                        {
                            break label1;
                        }
                    } while (!((BillingAddress)iterator1.next()).isSameBillingAddress(creditcard));
                    flag = true;
                }
                if (!flag)
                {
                    mBillingAddresses.add(new BillingAddress(creditcard));
                }
            } while (true);
        }
    }

    public void deleteCreditCard(CreditCard creditcard)
    {
        BillingAddress billingaddress = new BillingAddress(creditcard);
        mCreditCards.remove(creditcard);
        boolean flag1 = false;
        creditcard = mCreditCards.iterator();
        boolean flag;
        do
        {
            flag = flag1;
            if (!creditcard.hasNext())
            {
                break;
            }
            if (!billingaddress.isSameBillingAddress((CreditCard)creditcard.next()))
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        if (!flag)
        {
            mBillingAddresses.remove(billingaddress);
        }
    }

    public List getBillingAddresses()
    {
        return mBillingAddresses;
    }

    public List getCreditCards()
    {
        return mCreditCards;
    }

    public CreditCard getDefaultCard()
    {
        for (Iterator iterator = mCreditCards.iterator(); iterator.hasNext();)
        {
            CreditCard creditcard1 = (CreditCard)iterator.next();
            if (creditcard1.isDefault())
            {
                return creditcard1;
            }
        }

        CreditCard creditcard;
        if (mCreditCards.size() > 0)
        {
            creditcard = (CreditCard)mCreditCards.get(0);
        } else
        {
            creditcard = null;
        }
        return creditcard;
    }

    public boolean hasCreditCards()
    {
        return mCreditCards.size() > 0;
    }

    public boolean hasMobilePayData()
    {
        return mHasMobilePayData;
    }

    public void setCreditCards(List list)
    {
        setCreditCards(false, list);
    }

    public void setCreditCards(boolean flag, List list)
    {
        mHasMobilePayData = flag;
        mCreditCards.clear();
        if (list != null && !list.isEmpty())
        {
            mCreditCards.addAll(list);
            updateBillingAddresses();
        }
    }

    public void setHasMobilePayData(boolean flag)
    {
        mHasMobilePayData = flag;
    }

    public void updateCreditCard(CreditCard creditcard)
    {
        if (creditcard.isDefault())
        {
            for (Iterator iterator = mCreditCards.iterator(); iterator.hasNext();)
            {
                ((CreditCard)iterator.next()).isDefault = false;
            }

        }
        BillingAddress billingaddress = new BillingAddress(creditcard);
        int i = 0;
        do
        {
label0:
            {
                if (i < mCreditCards.size())
                {
                    CreditCard creditcard1 = (CreditCard)mCreditCards.get(i);
                    if (!creditcard1.getId().equals(creditcard.getId()))
                    {
                        break label0;
                    }
                    mCreditCards.remove(creditcard1);
                    mCreditCards.add(i, creditcard);
                    if (!(new BillingAddress(creditcard1)).isSameBillingAddress(creditcard))
                    {
                        updateBillingAddresses();
                    }
                }
                if (i >= mCreditCards.size())
                {
                    mCreditCards.add(creditcard);
                    if (!mBillingAddresses.contains(billingaddress))
                    {
                        mBillingAddresses.add(billingaddress);
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    static 
    {
        ISO_DATE = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        EXPIRE_DATE = new SimpleDateFormat("MM/yy", Locale.US);
    }
}
