// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.exceptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ErrorWithResponse extends Exception
{
    public static final class BraintreeError
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public BraintreeError createFromParcel(Parcel parcel)
            {
                return new BraintreeError(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public BraintreeError[] newArray(int i)
            {
                return new BraintreeError[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private String field;
        private List fieldErrors;
        private String message;

        public int describeContents()
        {
            return 0;
        }

        public BraintreeError errorFor(String s)
        {
label0:
            {
                if (fieldErrors == null)
                {
                    break label0;
                }
                Iterator iterator = fieldErrors.iterator();
                BraintreeError braintreeerror;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    braintreeerror = (BraintreeError)iterator.next();
                } while (!braintreeerror.field.equals(s));
                return braintreeerror;
            }
            return null;
        }

        public String getField()
        {
            return field;
        }

        public List getFieldErrors()
        {
            return fieldErrors;
        }

        public String getMessage()
        {
            return message;
        }

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("BraintreeError for ").append(field).append(": ").append(message).append(" -> ");
            String s;
            if (fieldErrors != null)
            {
                s = fieldErrors.toString();
            } else
            {
                s = "";
            }
            return stringbuilder.append(s).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeList(fieldErrors);
            parcel.writeString(field);
            parcel.writeString(message);
        }



        public BraintreeError()
        {
            fieldErrors = new ArrayList();
        }

        private BraintreeError(Parcel parcel)
        {
            fieldErrors = new ArrayList();
            fieldErrors = new ArrayList();
            parcel.readList(fieldErrors, java/util/ArrayList.getClassLoader());
            field = parcel.readString();
            message = parcel.readString();
        }

    }

    public static final class BraintreeErrors
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public BraintreeErrors createFromParcel(Parcel parcel)
            {
                return new BraintreeErrors(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public BraintreeErrors[] newArray(int i)
            {
                return new BraintreeErrors[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private BraintreeError error;
        private List fieldErrors;

        public int describeContents()
        {
            return 0;
        }

        protected List getFieldErrors()
        {
            return fieldErrors;
        }

        protected String getMessage()
        {
            if (error != null)
            {
                return error.getMessage();
            } else
            {
                return "Parsing error response failed";
            }
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeTypedList(fieldErrors);
            parcel.writeParcelable(error, 0);
        }


        public BraintreeErrors()
        {
            fieldErrors = new ArrayList();
        }

        private BraintreeErrors(Parcel parcel)
        {
            fieldErrors = new ArrayList();
            parcel.readTypedList(fieldErrors, BraintreeError.CREATOR);
            error = (BraintreeError)parcel.readParcelable(com/braintreepayments/api/exceptions/ErrorWithResponse$BraintreeError.getClassLoader());
        }

    }


    private final List fieldErrors;
    private final String message;
    private final int statusCode;

    public ErrorWithResponse(int i, BraintreeErrors braintreeerrors)
    {
        statusCode = i;
        if (braintreeerrors != null)
        {
            fieldErrors = braintreeerrors.getFieldErrors();
            message = braintreeerrors.getMessage();
            return;
        } else
        {
            fieldErrors = null;
            message = "Parsing error response failed";
            return;
        }
    }

    public ErrorWithResponse(int i, String s)
    {
        this(i, (BraintreeErrors)(new Gson()).fromJson(s, com/braintreepayments/api/exceptions/ErrorWithResponse$BraintreeErrors));
    }

    public BraintreeError errorFor(String s)
    {
label0:
        {
            if (fieldErrors == null)
            {
                break label0;
            }
            Iterator iterator = fieldErrors.iterator();
            BraintreeError braintreeerror;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                braintreeerror = (BraintreeError)iterator.next();
            } while (!braintreeerror.field.equals(s));
            return braintreeerror;
        }
        return null;
    }

    public List getFieldErrors()
    {
        return fieldErrors;
    }

    public String getMessage()
    {
        return message;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ErrorWithResponse (").append(statusCode).append("): ").append(message).append("\n").append(fieldErrors.toString()).toString();
    }
}
