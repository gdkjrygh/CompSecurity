// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.content.Context;
import com.walmart.android.service.JsonMapper;
import com.walmartlabs.utils.WLog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

class EReceiptIO
{

    private static final String DELETION_MARK_SUFFIX = "_";
    private static final String FILE_SEPARATOR = "-";
    private static final String NO_CUSTOMER_ID = "local";
    private static final String RECEIPT_DIRECTORY = "ereceipt";
    private static final String TAG = com/walmartlabs/ereceipt/service/EReceiptIO.getSimpleName();
    private static final JsonMapper sJsonMapper = new JsonMapper();
    private final File mReceiptDir;

    public EReceiptIO(Context context)
    {
        mReceiptDir = context.getDir("ereceipt", 0);
    }

    private EReceiptsResponse.Receipt readReceipt(File file)
    {
        EReceiptsResponse.Receipt receipt;
        receipt = null;
        if (file == null)
        {
            return null;
        }
        EReceiptsResponse.Receipt receipt1 = (EReceiptsResponse.Receipt)sJsonMapper.readValue(file, com/walmartlabs/ereceipt/service/EReceiptsResponse$Receipt);
        EReceiptsResponse.Receipt receipt2;
        receipt2 = receipt1;
        receipt = receipt1;
        if (!file.getName().endsWith("_"))
        {
            break MISSING_BLOCK_LABEL_48;
        }
        receipt = receipt1;
        receipt1.deleted = true;
        receipt2 = receipt1;
_L2:
        return receipt2;
        file;
        WLog.e(TAG, "Could not parse eReceipt from file", file);
        receipt2 = receipt;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void clearAll()
    {
        try
        {
            FileUtils.cleanDirectory(mReceiptDir);
            return;
        }
        catch (IOException ioexception)
        {
            WLog.d(TAG, (new StringBuilder()).append("Couldn't clean directory: ").append(ioexception).toString());
        }
    }

    public Map readAll()
    {
        File afile[] = mReceiptDir.listFiles();
        Object obj = null;
        if (afile != null)
        {
            HashMap hashmap = new HashMap();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                File file = afile[i];
                String as[] = file.getName().split("-");
                if (as == null || as.length <= 0)
                {
                    continue;
                }
                obj = null;
                if (!"local".equals(as[0]))
                {
                    obj = as[0];
                }
                List list = (List)hashmap.get(obj);
                Object obj1 = list;
                if (list == null)
                {
                    obj1 = new ArrayList();
                    hashmap.put(obj, obj1);
                }
                obj = readReceipt(file);
                if (obj != null)
                {
                    ((List) (obj1)).add(obj);
                }
            }

            WLog.i(TAG, (new StringBuilder()).append(afile.length).append(" eReceipt files read").toString());
            obj = hashmap;
        }
        return ((Map) (obj));
    }

}
