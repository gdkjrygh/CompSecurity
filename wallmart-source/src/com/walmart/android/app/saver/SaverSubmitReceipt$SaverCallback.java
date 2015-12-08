// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Bundle;
import android.os.Handler;
import com.walmart.android.service.saver.StatusResponse;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverSubmitReceipt

public static abstract class  extends SaverSubmitReceipt
{

    protected abstract boolean isEReceipt();

    public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
                            if (isTop())
                            {
                                dismissDialog(1001);
                                if (statusresponse == null)
                                {
                                    break label0;
                                }
                                int i = statusresponse.getErrorCode();
                                integer = statusresponse.message;
                                statusresponse = new Bundle();
                                statusresponse.putString("DIALOG_ARG_MESSAGE", integer);
                                switch (i)
                                {
                                case 1119: 
                                case 1120: 
                                case 1123: 
                                default:
                                    trackError("General Server Error");
                                    showDialog(1003, statusresponse);
                                    break;

                                case 1117: 
                                case 1118: 
                                    break label2;

                                case 1121: 
                                    break label3;

                                case 1122: 
                                    break label4;

                                case 1124: 
                                    break label1;
                                }
                            }
                            return;
                        }
                        if (!isEReceipt())
                        {
                            showDialog(1002, statusresponse);
                            trackError("Error Handling - Text Entry Not Recognized");
                            return;
                        }
                    }
                    trackError("Error Handling - Not Eligible");
                    showDialog(1004, statusresponse);
                    return;
                }
                trackError("Error Handling - Not Eligible");
                showDialog(1005, statusresponse);
                return;
            }
            trackError("General Server Error");
            showDialog(1006, statusresponse);
            return;
        }
        trackError("General Server Error");
        showDialog(1003);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StatusResponse)obj1);
    }

    public (Handler handler)
    {
        super(handler);
    }
}
