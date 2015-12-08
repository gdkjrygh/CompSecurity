// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.walmart.android.service:
//            MockResponseInfo

public class MockManager
{

    private static final String MOCK_PATH = "mockdata";
    private static final String MOCK_PREFS = "mock_prefs";
    public static final String TAG = com/walmart/android/service/MockManager.getSimpleName();
    private static MockManager sInstance;
    private Context mContext;
    private HashMap mServiceMap;

    public MockManager()
    {
    }

    private MockResponseInfo getBestMatchingMockResponse(ArrayList arraylist, HashMap hashmap)
    {
        Object obj = null;
        arraylist = new ArrayList(arraylist);
        Collections.sort(arraylist, new Comparator() {

            final MockManager this$0;

            public int compare(MockResponseInfo mockresponseinfo1, MockResponseInfo mockresponseinfo2)
            {
                return mockresponseinfo1.getParameters().size() - mockresponseinfo2.getParameters().size();
            }

            public volatile int compare(Object obj1, Object obj2)
            {
                return compare((MockResponseInfo)obj1, (MockResponseInfo)obj2);
            }

            
            {
                this$0 = MockManager.this;
                super();
            }
        });
        Iterator iterator = arraylist.iterator();
        arraylist = obj;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MockResponseInfo mockresponseinfo = (MockResponseInfo)iterator.next();
            if (mockresponseinfo.matchesParameters(hashmap))
            {
                arraylist = mockresponseinfo;
            }
        } while (true);
        return arraylist;
    }

    private String getBestMatchingMockResponseFileName(String s, String s1, String s2, HashMap hashmap)
    {
        Object obj = null;
        s1 = getMockResponseInfoList(s, s1, s2);
        s = obj;
        if (s1 != null)
        {
            s = obj;
            if (!s1.isEmpty())
            {
                s1 = getBestMatchingMockResponse(s1, hashmap);
                s = obj;
                if (s1 != null)
                {
                    s = s1.getFileName();
                }
            }
        }
        return s;
    }

    public static MockManager getInstance(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new MockManager();
            sInstance.init(context);
        }
        return sInstance;
    }

    private String getKey(String s, String s1)
    {
        return (new StringBuilder()).append(s).append("_").append(s1).toString();
    }

    private HashMap getMethodMapForService(String s)
    {
        return (HashMap)mServiceMap.get(s);
    }

    private ArrayList getMockResponseInfoList(String s, String s1, String s2)
    {
        s = getResponseNameMapForServiceMethod(s, s1);
        if (s != null)
        {
            return (ArrayList)s.get(s2);
        } else
        {
            return null;
        }
    }

    private HashMap getResponseNameMapForServiceMethod(String s, String s1)
    {
        s = getMethodMapForService(s);
        if (s != null)
        {
            return (HashMap)s.get(s1);
        } else
        {
            return null;
        }
    }

    private void init(Context context)
    {
        mContext = context.getApplicationContext();
        mServiceMap = new HashMap();
        context = context.getAssets();
        int j;
        context = context.list("mockdata");
        j = context.length;
        int i = 0;
_L2:
        String s;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = context[i];
        processFileName((new StringBuilder()).append("mockdata/").append(s).toString());
        i++;
        if (true) goto _L2; else goto _L1
        context;
        context.printStackTrace();
_L1:
    }

    private void processFileName(String s)
    {
        MockResponseInfo mockresponseinfo = new MockResponseInfo(s);
        Object obj = mockresponseinfo.getServiceName();
        String s2 = mockresponseinfo.getMethodName();
        String s1 = mockresponseinfo.getMockResponseName();
        HashMap hashmap = (HashMap)mServiceMap.get(obj);
        s = hashmap;
        if (hashmap == null)
        {
            s = new HashMap();
            mServiceMap.put(obj, s);
        }
        obj = (HashMap)s.get(s2);
        hashmap = ((HashMap) (obj));
        if (obj == null)
        {
            hashmap = new HashMap();
            s.put(s2, hashmap);
        }
        obj = (ArrayList)hashmap.get(s1);
        s = ((String) (obj));
        if (obj == null)
        {
            s = new ArrayList();
            hashmap.put(s1, s);
        }
        s.add(mockresponseinfo);
    }

    public void clearMockResponse(String s, String s1)
    {
        s = getKey(s, s1);
        s1 = mContext.getSharedPreferences("mock_prefs", 0).edit();
        s1.remove(s);
        s1.apply();
    }

    public void enableMockResponse(String s, String s1, String s2)
    {
        s = getKey(s, s1);
        s1 = mContext.getSharedPreferences("mock_prefs", 0).edit();
        s1.putString(s, s2);
        s1.apply();
    }

    public ArrayList getAvailableMethodNames(String s)
    {
        Object obj = null;
        HashMap hashmap = getMethodMapForService(s);
        s = obj;
        if (hashmap != null)
        {
            s = new ArrayList(hashmap.keySet());
            Collections.sort(s);
        }
        return s;
    }

    public ArrayList getAvailableMockResponseNames(String s, String s1)
    {
        s = getResponseNameMapForServiceMethod(s, s1);
        if (s != null)
        {
            return new ArrayList(s.keySet());
        } else
        {
            return null;
        }
    }

    public ArrayList getAvailableServiceNames()
    {
        ArrayList arraylist = new ArrayList(mServiceMap.keySet());
        Collections.sort(arraylist);
        return arraylist;
    }

    public String getMockResponseFileName(String s, String s1, HashMap hashmap)
    {
        String s2 = getMockResponseName(s, s1);
        if (s2 != null)
        {
            return getBestMatchingMockResponseFileName(s, s1, s2, hashmap);
        } else
        {
            return null;
        }
    }

    public String getMockResponseName(String s, String s1)
    {
        s = getKey(s, s1);
        s1 = mContext.getSharedPreferences("mock_prefs", 0);
        if (s1.contains(s))
        {
            return s1.getString(s, "");
        } else
        {
            return null;
        }
    }

    public boolean isMockResponseEnabled(String s, String s1, HashMap hashmap)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            String s2 = getKey(s, s1);
            SharedPreferences sharedpreferences = mContext.getSharedPreferences("mock_prefs", 0);
            flag = flag1;
            if (!sharedpreferences.contains(s2))
            {
                break label0;
            }
            s = getMockResponseInfoList(s, s1, sharedpreferences.getString(s2, "")).iterator();
            do
            {
                flag = flag1;
                if (!s.hasNext())
                {
                    break label0;
                }
            } while (!((MockResponseInfo)s.next()).matchesParameters(hashmap));
            flag = true;
        }
        return flag;
    }

}
