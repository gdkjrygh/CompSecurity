// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.ViewParent;
import com.walmartlabs.android.pharmacy.data.PrescriptionInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PharmacyUtils
{

    private static final int CALENDAR_EVENT_DURATION = 0x1b7740;
    public static final int MAXIMUM_VALID_RX_NUMBER = 0x98967f;
    public static final int MAXIMUM_VALID_STORE_NUMBER = 0x15f8f;
    public static final int MINIMUM_VALID_RX_NUMBER = 1;
    public static final int MINIMUM_VALID_STORE_NUMBER = 1;
    private static final String TAG = com/walmartlabs/android/pharmacy/PharmacyUtils.getSimpleName();
    public static final int VALID_PHONE_NUMBER_SIZE = 10;
    public static final SimpleDateFormat sPickupDateFormat;
    public static final SimpleDateFormat sPickupTimeFormat;
    private static final Pattern sPrescriptionBarcodePattern = Pattern.compile("^0(\\d{4,4})00(\\d{7,7})\\d{4}$");

    public PharmacyUtils()
    {
    }

    public static Intent createCalendarReminderIntent(long l, String s, String s1, String s2, String s3)
    {
        if (supportsCalendarContract())
        {
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setData(android.provider.CalendarContract.Events.CONTENT_URI);
            intent.putExtra("title", s);
            intent.putExtra("eventLocation", (new StringBuilder()).append(s1).append(", ").append(s2).append(", ").append(s3).toString());
            intent.putExtra("beginTime", l);
            intent.putExtra("endTime", l + 0x1b7740L);
            intent.putExtra("accessLevel", 2);
            return intent;
        } else
        {
            Intent intent1 = new Intent("android.intent.action.EDIT");
            intent1.setType("vnd.android.cursor.item/event");
            intent1.putExtra("title", s);
            intent1.putExtra("eventLocation", (new StringBuilder()).append(s1).append(", ").append(s2).append(", ").append(s3).toString());
            intent1.putExtra("beginTime", l);
            intent1.putExtra("endTime", l + 0x1b7740L);
            intent1.putExtra("visibility", 2);
            return intent1;
        }
    }

    public static String extractRawUSPhoneNumber(String s)
    {
        String s1 = s.replaceAll("[^\\d]", "");
        s = s1;
        if (s1.length() == 11)
        {
            s = s1;
            if (s1.startsWith("1"))
            {
                s = s1.substring(1);
            }
        }
        return s;
    }

    public static String formatUSPhoneNumber(String s)
    {
        return s.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

    public static PrescriptionInfo getPrescriptionInfo(String s)
    {
        Object obj = null;
        PrescriptionInfo prescriptioninfo = obj;
        if (!TextUtils.isEmpty(s))
        {
            s = sPrescriptionBarcodePattern.matcher(s);
            prescriptioninfo = obj;
            if (s.matches())
            {
                prescriptioninfo = new PrescriptionInfo();
                try
                {
                    prescriptioninfo.storeNumber = Integer.parseInt(s.group(1));
                    prescriptioninfo.rxNumber = Integer.parseInt(s.group(2));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    Log.e(TAG, "Should not happen");
                    return prescriptioninfo;
                }
            }
        }
        return prescriptioninfo;
    }

    public static boolean isValidEmailAddress(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            return Patterns.EMAIL_ADDRESS.matcher(charsequence).matches();
        } else
        {
            return false;
        }
    }

    public static boolean isValidPrescriptionNumber(int i)
    {
        return i >= 1 && i <= 0x98967f;
    }

    public static boolean isValidPrescriptionNumber(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_18;
        }
        boolean flag = isValidPrescriptionNumber(Integer.parseInt(s));
        return flag;
        s;
        return false;
    }

    public static boolean isValidStoreNumber(int i)
    {
        return i >= 1 && i <= 0x15f8f;
    }

    public static boolean isValidStoreNumber(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_18;
        }
        boolean flag = isValidStoreNumber(Integer.parseInt(s));
        return flag;
        s;
        return false;
    }

    public static boolean isValidUSPhoneNumber(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1;
            if (extractRawUSPhoneNumber(s).length() == 10)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static int mapFillStatusToFlagResId(com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill rxfill)
    {
        if (rxfill.isActive())
        {
            return R.drawable.flag_yellow;
        }
        if (rxfill.isFillStatusEqualTo("PICKED UP"))
        {
            return R.drawable.flag_grey;
        }
        if (rxfill.isFillStatusEqualTo("SHIPPED"))
        {
            return R.drawable.flag_grey;
        }
        if (rxfill.isFillStatusEqualTo("CANCELLED"))
        {
            return R.drawable.flag_red;
        } else
        {
            return 0;
        }
    }

    public static int mapFillStatusToStringResId(com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill rxfill)
    {
        if (rxfill.isActive())
        {
            return R.string.pharmacy_refill_status_order_placed;
        }
        if (rxfill.isFillStatusEqualTo("PICKED UP"))
        {
            return R.string.pharmacy_refill_status_picked;
        }
        if (rxfill.isFillStatusEqualTo("SHIPPED"))
        {
            return R.string.pharmacy_refill_status_shipped;
        }
        if (rxfill.isFillStatusEqualTo("CANCELLED"))
        {
            return R.string.pharmacy_refill_status_cancelled;
        } else
        {
            return 0;
        }
    }

    public static long pickupDateToMillisecondsSinceEpoch(String s, String s1)
    {
        long l;
        try
        {
            s = sPickupDateFormat.parse(s);
            s1 = sPickupTimeFormat.parse(s1);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar1 = Calendar.getInstance();
            calendar.setTime(s);
            calendar1.setTime(s1);
            calendar.set(9, calendar1.get(9));
            calendar.set(10, calendar1.get(10));
            calendar.set(12, calendar1.get(12));
            l = calendar.getTimeInMillis();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l;
    }

    public static void restoreLeftPaddingDropDown(View view, int i)
    {
        view.setPadding(i, view.getPaddingTop(), view.getPaddingLeft(), view.getPaddingBottom());
    }

    public static void scrollAndFocus(Activity activity, View view, View view1)
    {
        if (view1.isFocusable() || view1.isFocusableInTouchMode())
        {
            view1.clearFocus();
            view1.requestFocus();
            view1.requestFocusFromTouch();
            return;
        }
        activity = activity.getCurrentFocus();
        if (activity != null)
        {
            activity.clearFocus();
        }
        scrollTo(view, view1);
    }

    private static void scrollTo(View view, View view1)
    {
label0:
        {
            int i = view1.getTop();
            for (view1 = view1.getParent(); view1 != null && view1 != view; view1 = view1.getParent())
            {
                if (!(view1 instanceof View))
                {
                    break label0;
                }
                i += ((View)view1).getTop();
            }

            if (view1 == view)
            {
                view.scrollTo(0, i);
            }
        }
    }

    public static void setBackgroundResource(View view, int i)
    {
        int j = view.getPaddingLeft();
        int k = view.getPaddingTop();
        int l = view.getPaddingRight();
        int i1 = view.getPaddingBottom();
        view.setBackgroundResource(i);
        view.setPadding(j, k, l, i1);
    }

    private static boolean supportsCalendarContract()
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && (!"HTC".equals(Build.MANUFACTURER) || android.os.Build.VERSION.SDK_INT >= 16);
    }

    static 
    {
        sPickupDateFormat = new SimpleDateFormat("MMddyyyy", Locale.US);
        sPickupTimeFormat = new SimpleDateFormat("hh:mm a", Locale.US);
    }
}
