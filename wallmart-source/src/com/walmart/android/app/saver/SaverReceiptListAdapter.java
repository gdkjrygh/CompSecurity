// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.SimpleCursorAdapter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.Typefaces;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.text.WordUtils;

public class SaverReceiptListAdapter extends SimpleCursorAdapter
    implements BasicFilterAdapter.DelegateAdapter
{
    private class SaverReceiptViewBinder
        implements android.support.v4.widget.SimpleCursorAdapter.ViewBinder
    {

        final SaverReceiptListAdapter this$0;

        private Date getDate(Cursor cursor)
        {
            Date date = null;
            if (!cursor.isNull(mLocalDateColumn))
            {
                try
                {
                    date = EReceiptsContractUtil.SQLITE_FORMAT.parse(cursor.getString(mLocalDateColumn));
                }
                // Misplaced declaration of an exception variable
                catch (Cursor cursor)
                {
                    return null;
                }
            } else
            if (!cursor.isNull(mSaverDateColumn))
            {
                try
                {
                    cursor = EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(cursor.getString(mSaverDateColumn));
                }
                // Misplaced declaration of an exception variable
                catch (Cursor cursor)
                {
                    return null;
                }
                return cursor;
            }
            return date;
        }

        private CharSequence getUnavailableState(boolean flag)
        {
            if (!hasSaverData() || flag)
            {
                return setTime.getString(0x7f0904ff);
            } else
            {
                return null;
            }
        }

        public String getFormattedAddressLine1(String s)
        {
            if (s != null)
            {
                return WordUtils.capitalizeFully(s);
            } else
            {
                return null;
            }
        }

        public String getFormattedAddressLine2(String s)
        {
            if (s != null)
            {
                Matcher matcher = SaverReceiptListAdapter.ADDRESS_PATTERN.matcher(s);
                if (matcher.matches())
                {
                    return (new StringBuilder()).append(WordUtils.capitalizeFully(matcher.group(1))).append(",").append(matcher.group(2)).toString();
                } else
                {
                    return WordUtils.capitalizeFully(s);
                }
            } else
            {
                return null;
            }
        }

        public boolean setViewValue(View view, Cursor cursor, int i)
        {
            if (mLocalDateColumn != i) goto _L2; else goto _L1
_L1:
            Object obj = getDate(cursor);
            if (obj == null) goto _L4; else goto _L3
_L3:
            mCalendar.setTime(((Date) (obj)));
            if (view.getId() != 0x7f1004aa) goto _L6; else goto _L5
_L5:
            view = (TextView)view;
            if (cursor.getPosition() > 0 && cursor.moveToPrevious())
            {
                obj = getDate(cursor);
                if (obj != null)
                {
                    mPreviousCalendar.setTime(((Date) (obj)));
                } else
                {
                    mPreviousCalendar.clear();
                }
                cursor.moveToNext();
            } else
            {
                mPreviousCalendar.clear();
            }
            if (mPreviousCalendar.isSet(2) && mPreviousCalendar.get(2) == mCalendar.get(2))
            {
                view.setVisibility(8);
            } else
            {
                view.setVisibility(0);
                view.setText(SaverReceiptListAdapter.SECTION_HEADER_FORMAT.format(mCalendar.getTime()));
            }
_L4:
            return true;
_L6:
            if (view.getId() == 0x7f100102)
            {
                ((TextView)view).setText(SaverReceiptListAdapter.DAY_OF_MONTH_FORMAT.format(mCalendar.getTime()));
            } else
            if (view.getId() == 0x7f100103)
            {
                ((TextView)view).setText(SaverReceiptListAdapter.DAY_OF_WEEK_FORMAT.format(mCalendar.getTime()).toLowerCase());
            }
            if (true) goto _L4; else goto _L2
_L2:
            if (mItemsColumn == i)
            {
                if (!cursor.isNull(mItemsColumn))
                {
                    i = cursor.getInt(i);
                    ((TextView)view).setText(setTime.getResources().getQuantityString(0x7f110003, i, new Object[] {
                        Integer.valueOf(i)
                    }));
                    view.setVisibility(0);
                } else
                {
                    view.setVisibility(8);
                }
                return true;
            }
            if (mPriceColumn == i)
            {
                if (!cursor.isNull(mPriceColumn))
                {
                    ((TextView)view).setText(setTime.getString(0x7f0900fc, new Object[] {
                        Float.valueOf((float)cursor.getInt(i) * 0.01F)
                    }));
                    view.setVisibility(0);
                } else
                {
                    view.setVisibility(8);
                }
                return true;
            }
            if (mAddressOneColumn == i)
            {
                if (!cursor.isNull(mAddressOneColumn))
                {
                    cursor = getFormattedAddressLine1(cursor.getString(mAddressOneColumn));
                    ((TextView)view).setText(cursor);
                    view.setVisibility(0);
                } else
                {
                    view.setVisibility(8);
                }
                return true;
            }
            if (mAddressTwoColumn == i)
            {
                if (!cursor.isNull(mAddressTwoColumn))
                {
                    cursor = getFormattedAddressLine2(cursor.getString(mAddressTwoColumn));
                    ((TextView)view).setText(cursor);
                    view.setVisibility(0);
                } else
                {
                    view.setVisibility(8);
                }
                return true;
            }
            if (mSaverStateColumn != i) goto _L8; else goto _L7
_L7:
            com.walmart.android.service.saver.SaverContract.SaverState saverstate;
            boolean flag;
            saverstate = com.walmart.android.service.saver.SaverContract.SaverState.find(cursor.getInt(mSaverStateColumn));
            i = cursor.getInt(mRejectedReasonColumn);
            static class _cls1
            {

                static final int $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[];

                static 
                {
                    $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState = new int[com.walmart.android.service.saver.SaverContract.SaverState.values().length];
                    try
                    {
                        $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[com.walmart.android.service.saver.SaverContract.SaverState.Processing.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[com.walmart.android.service.saver.SaverContract.SaverState.CreditFound.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[com.walmart.android.service.saver.SaverContract.SaverState.NoCreditFound.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[com.walmart.android.service.saver.SaverContract.SaverState.Invalid.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[com.walmart.android.service.saver.SaverContract.SaverState.Unknown.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            if (cursor.getInt(mSubmitConfirmedColumn) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (view.getId() != 0x7f1004ac) goto _L10; else goto _L9
_L9:
            _cls1..SwitchMap.com.walmart.android.service.saver.SaverContract.SaverState[saverstate.ordinal()];
            JVM INSTR tableswitch 1 5: default 696
        //                       1 726
        //                       2 787
        //                       3 886
        //                       4 904
        //                       5 956;
               goto _L11 _L12 _L13 _L14 _L15 _L16
_L11:
            obj = getUnavailableState(flag);
_L19:
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                view.setVisibility(8);
            } else
            {
                view.setVisibility(0);
                ((TextView)view).setText(((CharSequence) (obj)));
                if (cursor.getInt(mSeenColumn) == 1)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i == 0 && (saverstate == com.walmart.android.service.saver.SaverContract.SaverState.CreditFound || saverstate == com.walmart.android.service.saver.SaverContract.SaverState.NoCreditFound))
                {
                    if (android.os.Build.VERSION.SDK_INT >= 16)
                    {
                        ((TextView)view).setTypeface(Typefaces.create(setTime, com.walmart.android.wmui.Typefaces.Family.REGULAR), 0);
                    } else
                    {
                        ((TextView)view).setTypeface(((TextView)view).getTypeface(), 1);
                    }
                } else
                {
                    ((TextView)view).setTypeface(Typefaces.create(setTime, com.walmart.android.wmui.Typefaces.Family.LIGHT), 0);
                }
            }
_L17:
            return true;
_L12:
            obj = new SpannableStringBuilder(setTime.getString(0x7f0904fe));
            ((SpannableStringBuilder) (obj)).setSpan(new ForegroundColorSpan(setTime.getResources().getColor(0x7f0f00e4)), 0, ((SpannableStringBuilder) (obj)).length(), 17);
            continue; /* Loop/switch isn't completed */
_L13:
            i = cursor.getInt(mSaverGetBackColumn);
            obj = new SpannableStringBuilder(setTime.getString(0x7f0904fa, new Object[] {
                Integer.valueOf(i / 100), Integer.valueOf(i % 100)
            }));
            ((SpannableStringBuilder) (obj)).setSpan(new ForegroundColorSpan(setTime.getResources().getColor(0x7f0f00de)), 0, ((SpannableStringBuilder) (obj)).length(), 17);
            continue; /* Loop/switch isn't completed */
_L14:
            obj = setTime.getString(0x7f0904fb);
            continue; /* Loop/switch isn't completed */
_L15:
            if (cursor.isNull(mUUIDColumn))
            {
                obj = setTime.getString(0x7f0904f9);
            } else
            {
                obj = setTime.getString(0x7f0904fc);
            }
            continue; /* Loop/switch isn't completed */
_L16:
            if (com.walmart.android.service.saver.SaverContract.SaverRejectedReasons.isPermanentRejectReason(i))
            {
                obj = setTime.getString(0x7f0904fc);
            } else
            {
                obj = getUnavailableState(flag);
            }
            continue; /* Loop/switch isn't completed */
_L10:
            if (view.getId() == 0x7f1004b0)
            {
                if (saverstate == com.walmart.android.service.saver.SaverContract.SaverState.Unknown && !com.walmart.android.service.saver.SaverContract.SaverRejectedReasons.isPermanentRejectReason(i) && TextUtils.isEmpty(getUnavailableState(flag)))
                {
                    view.setVisibility(0);
                } else
                {
                    view.setVisibility(8);
                }
            }
            if (true) goto _L17; else goto _L8
_L8:
            return false;
            if (true) goto _L19; else goto _L18
_L18:
        }

        private SaverReceiptViewBinder()
        {
            this$0 = SaverReceiptListAdapter.this;
            super();
        }

    }


    private static final Pattern ADDRESS_PATTERN = Pattern.compile("(.*?),?(\\s[A-Z]{2}\\s[0-9]{5})$");
    private static final DateFormat DAY_OF_MONTH_FORMAT = new SimpleDateFormat("d");
    private static final DateFormat DAY_OF_WEEK_FORMAT = new SimpleDateFormat("EEE");
    private static final DateFormat SECTION_HEADER_FORMAT = new SimpleDateFormat("MMMM yyyy");
    private int mAddressOneColumn;
    private int mAddressTwoColumn;
    private final Calendar mCalendar = Calendar.getInstance();
    private boolean mEnabled;
    private boolean mHasSaverData;
    private int mItemsColumn;
    private int mLocalDateColumn;
    private final Calendar mPreviousCalendar = Calendar.getInstance();
    private int mPriceColumn;
    private int mRejectedReasonColumn;
    private int mSaverDateColumn;
    private int mSaverGetBackColumn;
    private int mSaverStateColumn;
    private int mSeenColumn;
    private int mSubmitConfirmedColumn;
    private int mTcNbrColumn;
    private int mUUIDColumn;

    public SaverReceiptListAdapter(Context context)
    {
        super(context, 0x7f040155, null, new String[] {
            "localDateTime", "localDateTime", "localDateTime", "addressLine1", "addressLine2", "itemsSold", "total", "state", "state"
        }, new int[] {
            0x7f1004aa, 0x7f100102, 0x7f100103, 0x7f100104, 0x7f100105, 0x7f1004af, 0x7f1004ae, 0x7f1004ac, 0x7f1004b0
        }, 0);
        mEnabled = true;
        setViewBinder(new SaverReceiptViewBinder(null));
    }

    private void findColumns(Cursor cursor)
    {
        if (cursor != null)
        {
            mUUIDColumn = cursor.getColumnIndex("uuid");
            mLocalDateColumn = cursor.getColumnIndex("localDateTime");
            mItemsColumn = cursor.getColumnIndex("itemsSold");
            mPriceColumn = cursor.getColumnIndex("total");
            mAddressOneColumn = cursor.getColumnIndex("addressLine1");
            mAddressTwoColumn = cursor.getColumnIndex("addressLine2");
            mSaverStateColumn = cursor.getColumnIndex("state");
            mSaverGetBackColumn = cursor.getColumnIndex("getItBackCents");
            mRejectedReasonColumn = cursor.getColumnIndex("rejected_reason");
            mSeenColumn = cursor.getColumnIndex("seen");
            mSubmitConfirmedColumn = cursor.getColumnIndex("submitConfirmed");
            mSaverDateColumn = cursor.getColumnIndex("visitDate");
            mTcNbrColumn = cursor.getColumnIndex("tcNumber");
        }
    }

    public int findPosition(String s)
    {
        Cursor cursor;
        int i;
        cursor = getCursor();
        if (cursor == null || s == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        i = cursor.getPosition();
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        if (!s.equals(cursor.getString(mUUIDColumn))) goto _L4; else goto _L3
_L3:
        int j = cursor.getPosition();
        cursor.moveToPosition(i);
        return j;
_L4:
        if (!s.equals(cursor.getString(mTcNbrColumn)))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        j = cursor.getPosition();
        cursor.moveToPosition(i);
        return j;
        boolean flag = cursor.moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        cursor.moveToPosition(i);
        return -1;
        s;
        cursor.moveToPosition(i);
        throw s;
    }

    public String getCurrentReceiptId(int i)
    {
        String s;
        Cursor cursor;
        int j;
        Object obj = null;
        cursor = getCursor();
        s = obj;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        s = obj;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        s = obj;
        if (i >= cursor.getCount())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        j = cursor.getPosition();
        String s1;
        cursor.moveToPosition(i);
        s1 = cursor.getString(mUUIDColumn);
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        s = cursor.getString(mTcNbrColumn);
        cursor.moveToPosition(j);
        return s;
        Exception exception;
        exception;
        cursor.moveToPosition(j);
        throw exception;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view != null)
        {
            ViewUtil.findViewById(view, 0x7f1004b2).setVisibility(8);
            ViewUtil.findViewById(view, 0x7f1004b1).setVisibility(8);
        }
        return super.getView(i, view, viewgroup);
    }

    boolean hasSaverData()
    {
        return mHasSaverData;
    }

    public boolean isConvertView(View view)
    {
        return view != null && view.getId() == 0x7f1004a9;
    }

    public boolean isEnabled(int i)
    {
        return mEnabled;
    }

    void setEnabled(boolean flag)
    {
        mEnabled = flag;
    }

    void setHasSaverData(boolean flag)
    {
        mHasSaverData = flag;
    }

    public Cursor swapCursor(Cursor cursor)
    {
        findColumns(cursor);
        return super.swapCursor(cursor);
    }
































}
