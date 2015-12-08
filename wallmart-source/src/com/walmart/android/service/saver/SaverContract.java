// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.provider.BaseColumns;

public interface SaverContract
{
    public static interface CompetitorColumns
        extends BaseColumns
    {

        public static final String ITEM_ID = "itemId";
        public static final String NAME = "competitorName";
        public static final String UNIT_PRICE = "competitorUnitPrice";
    }

    public static interface ItemColumns
        extends BaseColumns
    {

        public static final String ASSOCIATE_DISCOUNT = "associateDiscount";
        public static final String CREDITED = "credited";
        public static final String DETAILS_ID = "receiptId";
        public static final String MEASUREMENT = "measurement";
        public static final String NORMALIZED_UPC = "normalizedUpc";
        public static final String PRE_DISCOUNT_RETAIL_PRICE = "preDiscountRetailPrice";
        public static final String PRE_DISCOUNT_UNIT_PRICE = "preDiscountUnitPrice";
        public static final String REMAINING_QUANTITY = "remainingQty";
        public static final String RETAIL_PRICE = "retailPrice";
        public static final String RETURN_QUANTITY = "returnQty";
        public static final String UNIT_PRICE = "unitPrice";
        public static final String UNIT_QUANTITY = "unitQuantity";
        public static final String UPC = "upc";
    }

    public static interface ReceiptColumns
        extends BaseColumns
    {

        public static final String COMPETITORS = "competitors";
        public static final String DATE = "visitDate";
        public static final String GET_IT_BACK = "getItBackCents";
        public static final String SERVER_STATE = "serverState";
        public static final String STATE = "state";
        public static final String TC_NBR = "tcNumber";
        public static final String TOTAL_BACK = "totalBackCents";
        public static final String TOTAL_TAX_BACK = "backTaxCents";
    }

    public static interface ReceiptDecorationColumns
        extends BaseColumns
    {

        public static final String DATE = "visitDate";
        public static final String ERECEIPT_DELETED = "eReceiptDeleted";
        public static final String ERECEIPT_MISSING = "eReceiptMissing";
        public static final String NOTIFICATION_SHOWN = "notificationShown";
        public static final String REJECTED_REASON = "rejected_reason";
        public static final String SEEN = "seen";
        public static final String SUBMIT_CONFIRMED = "submitConfirmed";
        public static final String TC_NBR = "tcNumber";
    }

    public static final class SaverRejectedReasons extends Enum
    {

        private static final SaverRejectedReasons $VALUES[];
        public static final SaverRejectedReasons ALREADY_SUBMITTED;
        public static final SaverRejectedReasons LIMIT_REACHED;
        public static final SaverRejectedReasons NONE;
        public static final SaverRejectedReasons PRE_PROGRAM;
        public static final SaverRejectedReasons TOO_OLD;
        public static final SaverRejectedReasons UNKNOWN;
        private final int mReason;

        public static SaverRejectedReasons find(int i)
        {
            SaverRejectedReasons asaverrejectedreasons[] = values();
            int k = asaverrejectedreasons.length;
            for (int j = 0; j < k; j++)
            {
                SaverRejectedReasons saverrejectedreasons = asaverrejectedreasons[j];
                if (saverrejectedreasons.mReason == i)
                {
                    return saverrejectedreasons;
                }
            }

            return UNKNOWN;
        }

        public static boolean isPermanentRejectReason(int i)
        {
            return i == PRE_PROGRAM.getReason() || i == TOO_OLD.getReason() || i == ALREADY_SUBMITTED.getReason();
        }

        public static SaverRejectedReasons valueOf(String s)
        {
            return (SaverRejectedReasons)Enum.valueOf(com/walmart/android/service/saver/SaverContract$SaverRejectedReasons, s);
        }

        public static SaverRejectedReasons[] values()
        {
            return (SaverRejectedReasons[])$VALUES.clone();
        }

        public int getReason()
        {
            return mReason;
        }

        static 
        {
            UNKNOWN = new SaverRejectedReasons("UNKNOWN", 0, 0);
            PRE_PROGRAM = new SaverRejectedReasons("PRE_PROGRAM", 1, 1);
            TOO_OLD = new SaverRejectedReasons("TOO_OLD", 2, 2);
            LIMIT_REACHED = new SaverRejectedReasons("LIMIT_REACHED", 3, 3);
            NONE = new SaverRejectedReasons("NONE", 4, 4);
            ALREADY_SUBMITTED = new SaverRejectedReasons("ALREADY_SUBMITTED", 5, 5);
            $VALUES = (new SaverRejectedReasons[] {
                UNKNOWN, PRE_PROGRAM, TOO_OLD, LIMIT_REACHED, NONE, ALREADY_SUBMITTED
            });
        }

        private SaverRejectedReasons(String s, int i, int j)
        {
            super(s, i);
            mReason = j;
        }
    }

    public static final class SaverState extends Enum
    {

        private static final SaverState $VALUES[];
        public static final SaverState CreditFound;
        public static final SaverState Invalid;
        public static final SaverState NoCreditFound;
        public static final SaverState Processing;
        public static final SaverState Unknown;
        private final String mLabel;
        private final int mState;

        public static SaverState find(int i)
        {
            SaverState asaverstate[] = values();
            int k = asaverstate.length;
            for (int j = 0; j < k; j++)
            {
                SaverState saverstate = asaverstate[j];
                if (saverstate.mState == i)
                {
                    return saverstate;
                }
            }

            return Unknown;
        }

        public static SaverState find(String s)
        {
            SaverState asaverstate[] = values();
            int j = asaverstate.length;
            for (int i = 0; i < j; i++)
            {
                SaverState saverstate = asaverstate[i];
                if (saverstate.mLabel.equals(s))
                {
                    return saverstate;
                }
            }

            return Unknown;
        }

        public static boolean isProcessed(int i)
        {
            return i == CreditFound.getState() || i == NoCreditFound.getState();
        }

        public static SaverState valueOf(String s)
        {
            return (SaverState)Enum.valueOf(com/walmart/android/service/saver/SaverContract$SaverState, s);
        }

        public static SaverState[] values()
        {
            return (SaverState[])$VALUES.clone();
        }

        public int getState()
        {
            return mState;
        }

        static 
        {
            Unknown = new SaverState("Unknown", 0, 0, "n/a");
            Processing = new SaverState("Processing", 1, 1, "processing");
            CreditFound = new SaverState("CreditFound", 2, 2, "credit_found");
            NoCreditFound = new SaverState("NoCreditFound", 3, 3, "no_credit_found");
            Invalid = new SaverState("Invalid", 4, 4, "invalid");
            $VALUES = (new SaverState[] {
                Unknown, Processing, CreditFound, NoCreditFound, Invalid
            });
        }

        private SaverState(String s, int i, int j, String s1)
        {
            super(s, i);
            mState = j;
            mLabel = s1;
        }
    }


    public static final String COLUMN_ORDER = "item_order";
}
