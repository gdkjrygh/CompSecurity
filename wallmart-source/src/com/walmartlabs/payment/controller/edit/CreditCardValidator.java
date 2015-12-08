// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmartlabs.payment.controller.methods.AddressAdapter;
import com.walmartlabs.payment.view.CreditCardView;
import com.walmartlabs.ui.FloatLabel;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;

public class CreditCardValidator
{

    public CreditCardValidator()
    {
    }

    public static void clearErrorForField(FloatLabel floatlabel)
    {
        floatlabel.clearError();
    }

    public static boolean isAddressValid(CreditCardView creditcardview)
    {
        return creditcardview.getAddress1() != null && !TextUtils.isEmpty(creditcardview.getAddress1());
    }

    public static boolean isCityValid(CreditCardView creditcardview)
    {
        return creditcardview.getCity() != null && !TextUtils.isEmpty(creditcardview.getCity());
    }

    public static boolean isCreditCardInfoValid(CreditCardView creditcardview)
    {
        return isFirstNameValid(creditcardview) && isLastNameValid(creditcardview) && isCreditCardNumberValid(creditcardview) && isExpiryDateValid(creditcardview) && isCvvValid(creditcardview) && isAddressValid(creditcardview) && isCityValid(creditcardview) && isStateValid(creditcardview.getContext(), creditcardview) && isZipCodeValid(creditcardview);
    }

    public static boolean isCreditCardNumberValid(CreditCardView creditcardview)
    {
        return creditcardview.getCardNumber() != null && !"UNKNOWN".equals(creditcardview.validateCreditCardType(creditcardview.getCardNumber()));
    }

    public static boolean isCvvValid(CreditCardView creditcardview)
    {
        creditcardview = creditcardview.getCvv();
        return creditcardview != null && !creditcardview.isEmpty() && creditcardview.length() >= 3 && creditcardview.length() <= 4 && Pattern.matches("[0-9]+", creditcardview);
    }

    public static boolean isExpiryDateValid(CreditCardView creditcardview)
    {
        if (!creditcardview.getCardType().equals("WMUSGESTORECARD"))
        {
            int i = creditcardview.getExpiryMonth();
            int j = creditcardview.getExpiryYear();
            if ((i <= 0 || i > 12 || j < Calendar.getInstance().get(1)) && !creditcardview.getCardType().equals("WMUSGESTORECARD"))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isFirstNameValid(CreditCardView creditcardview)
    {
        return creditcardview.getFirstName() != null && !TextUtils.isEmpty(creditcardview.getFirstName());
    }

    public static boolean isLastNameValid(CreditCardView creditcardview)
    {
        return creditcardview.getLastName() != null && !TextUtils.isEmpty(creditcardview.getLastName());
    }

    public static boolean isPhoneValid(CreditCardView creditcardview)
    {
        return !TextUtils.isEmpty(creditcardview.getPhoneNumber());
    }

    public static boolean isStateValid(Context context, CreditCardView creditcardview)
    {
        context = context.getResources().getStringArray(com.walmartlabs.android.payment.R.array.pm_states_list);
        return creditcardview.getState() != null && !TextUtils.isEmpty(creditcardview.getState()) && Arrays.asList(context).contains(creditcardview.getState());
    }

    public static boolean isZipCodeValid(CreditCardView creditcardview)
    {
        creditcardview = creditcardview.getZipCode();
        return creditcardview != null && !TextUtils.isEmpty(creditcardview) && creditcardview.length() == 5 && Pattern.matches("[0-9]+", creditcardview);
    }

    public static void showErrorForField(int i, View view, FloatLabel floatlabel, boolean flag)
    {
        floatlabel.setError(i);
        if (flag)
        {
            view.requestFocus();
        }
    }

    public static void showErrorForField(Context context, int i, View view)
    {
        String s = context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err);
        (new com.walmart.android.ui.dialog.AlertDialog.Builder(context)).setTitle(s).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface.dismiss();
            }

        }).setMessage(context.getResources().getString(i)).setOnDismissListener(new android.content.DialogInterface.OnDismissListener(view) {

            final View val$field;

            public void onDismiss(DialogInterface dialoginterface)
            {
                if (field != null)
                {
                    field.requestFocus();
                }
            }

            
            {
                field = view;
                super();
            }
        }).create().show();
    }

    public static boolean validateCreditCard(CreditCardView creditcardview)
    {
        boolean flag;
label0:
        {
label1:
            {
                flag = true;
                boolean flag1;
                if (!isFirstNameValid(creditcardview))
                {
                    showErrorForField(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_required, creditcardview.getFirstNameView(), creditcardview.getFirstNameLabel(), true);
                    flag = false;
                } else
                {
                    clearErrorForField(creditcardview.getFirstNameLabel());
                }
                if (!isLastNameValid(creditcardview))
                {
                    showErrorForField(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_required, creditcardview.getLastNameView(), creditcardview.getLastNameLabel(), flag);
                    flag = false;
                } else
                {
                    clearErrorForField(creditcardview.getLastNameLabel());
                }
                if (!creditcardview.hasExistingCard() && !isCreditCardNumberValid(creditcardview))
                {
                    showErrorForField(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_required, creditcardview.getCardNumberView(), creditcardview.getCardNumberLabel(), flag);
                    flag = false;
                } else
                {
                    clearErrorForField(creditcardview.getCardNumberLabel());
                }
                if (!isExpiryDateValid(creditcardview))
                {
                    showErrorForField(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_expiry, creditcardview.getExpiryDateView(), creditcardview.getExpiryDateLabel(), flag);
                    flag = false;
                } else
                {
                    clearErrorForField(creditcardview.getExpiryDateLabel());
                }
                if (!isCvvValid(creditcardview))
                {
                    showErrorForField(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_required, creditcardview.getCvvView(), creditcardview.getCvvLabel(), flag);
                    flag = false;
                } else
                {
                    clearErrorForField(creditcardview.getCvvLabel());
                }
                if (!isPhoneValid(creditcardview))
                {
                    showErrorForField(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_required, creditcardview.getPhoneView(), creditcardview.getPhoneLabel(), flag);
                    flag = false;
                } else
                {
                    clearErrorForField(creditcardview.getPhoneLabel());
                }
                if (creditcardview.getBillingAddressList() != null && creditcardview.getBillingAddressList().getAdapter() != null)
                {
                    flag1 = flag;
                    if (((AddressAdapter)creditcardview.getBillingAddressList().getAdapter()).getSelectedAddress() != null)
                    {
                        break label1;
                    }
                }
                if (!isAddressValid(creditcardview))
                {
                    showErrorForField(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_required, creditcardview.getAddress1View(), creditcardview.getAddress1Label(), flag);
                    flag = false;
                } else
                {
                    clearErrorForField(creditcardview.getAddress1Label());
                }
                if (!isCityValid(creditcardview))
                {
                    showErrorForField(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_required, creditcardview.getCityView(), creditcardview.getCityLabel(), flag);
                    flag = false;
                } else
                {
                    clearErrorForField(creditcardview.getCityLabel());
                }
                if (!isStateValid(creditcardview.getContext(), creditcardview))
                {
                    showErrorForField(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_required, creditcardview.getStateView(), creditcardview.getStateLabel(), flag);
                    flag = false;
                } else
                {
                    clearErrorForField(creditcardview.getStateLabel());
                }
                if (isStateValid(creditcardview.getContext(), creditcardview))
                {
                    break label0;
                }
                showErrorForField(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_required, creditcardview.getZipCodeView(), creditcardview.getZipCodeLabel(), flag);
                flag1 = false;
            }
            return flag1;
        }
        clearErrorForField(creditcardview.getZipCodeLabel());
        return flag;
    }
}
