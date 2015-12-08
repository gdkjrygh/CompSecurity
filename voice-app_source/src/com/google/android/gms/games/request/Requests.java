// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.request:
//            OnRequestReceivedListener, GameRequestBuffer

public interface Requests
{
    public static interface LoadRequestSummariesResult
        extends Releasable, Result
    {
    }

    public static interface LoadRequestsResult
        extends Releasable, Result
    {

        public abstract GameRequestBuffer getRequests(int i);
    }

    public static interface SendRequestResult
        extends Result
    {
    }

    public static interface UpdateRequestsResult
        extends Releasable, Result
    {

        public abstract Set getRequestIds();

        public abstract int getRequestOutcome(String s);
    }


    public static final String EXTRA_REQUESTS = "requests";
    public static final int MAX_REQUEST_RECIPIENTS = 8;
    public static final int REQUEST_DEFAULT_LIFETIME_DAYS = -1;
    public static final int REQUEST_DIRECTION_INBOUND = 0;
    public static final int REQUEST_DIRECTION_OUTBOUND = 1;
    public static final int REQUEST_UPDATE_OUTCOME_FAIL = 1;
    public static final int REQUEST_UPDATE_OUTCOME_RETRY = 2;
    public static final int REQUEST_UPDATE_OUTCOME_SUCCESS = 0;
    public static final int REQUEST_UPDATE_TYPE_ACCEPT = 0;
    public static final int REQUEST_UPDATE_TYPE_DISMISS = 1;
    public static final int SORT_ORDER_EXPIRING_SOON_FIRST = 0;
    public static final int SORT_ORDER_SOCIAL_AGGREGATION = 1;

    public abstract PendingResult acceptRequest(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult acceptRequests(GoogleApiClient googleapiclient, List list);

    public abstract PendingResult dismissRequest(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult dismissRequests(GoogleApiClient googleapiclient, List list);

    public abstract ArrayList getGameRequestsFromBundle(Bundle bundle);

    public abstract ArrayList getGameRequestsFromInboxResponse(Intent intent);

    public abstract Intent getInboxIntent(GoogleApiClient googleapiclient);

    public abstract int getMaxLifetimeDays(GoogleApiClient googleapiclient);

    public abstract int getMaxPayloadSize(GoogleApiClient googleapiclient);

    public abstract Intent getSendIntent(GoogleApiClient googleapiclient, int i, byte abyte0[], int j, Bitmap bitmap, String s);

    public abstract PendingResult loadRequests(GoogleApiClient googleapiclient, int i, int j, int k);

    public abstract void registerRequestListener(GoogleApiClient googleapiclient, OnRequestReceivedListener onrequestreceivedlistener);

    public abstract void unregisterRequestListener(GoogleApiClient googleapiclient);
}
