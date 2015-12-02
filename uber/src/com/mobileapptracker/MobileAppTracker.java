// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import bnf;
import bng;
import bnh;
import bni;
import bnj;
import bnk;
import bnl;
import bnm;
import bnn;
import bno;
import bnp;
import bnq;
import bnr;
import bns;
import bnt;
import bnu;
import bnv;
import bnw;
import bnx;
import bny;
import bnz;
import boa;
import bob;
import boc;
import bod;
import boe;
import bof;
import bog;
import boh;
import boi;
import boj;
import bok;
import bol;
import bom;
import bon;
import boo;
import bop;
import boq;
import bor;
import bos;
import bot;
import bou;
import bov;
import bow;
import box;
import boz;
import bpa;
import bpb;
import bpc;
import bpd;
import bpe;
import bpf;
import bpg;
import bph;
import bpi;
import bpj;
import bpk;
import bpl;
import bpm;
import bpn;
import bpo;
import bpp;
import bpq;
import bpr;
import bps;
import bpt;
import bpu;
import bpv;
import bpw;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mobileapptracker:
//            Parameters, MATTestRequest, MATResponse, Encryption, 
//            MATEventQueue, MATEventItem

public class MobileAppTracker
{

    public static final int GENDER_FEMALE = 1;
    public static final int GENDER_MALE = 0;
    private static volatile MobileAppTracker g = null;
    private final String a = "heF9BATUfWuISyO8";
    private boz b;
    private Encryption c;
    private boolean d;
    private boolean e;
    protected MATEventQueue eventQueue;
    private ExecutorService f;
    protected boolean initialized;
    public boolean isRegistered;
    public Context mContext;
    protected MATTestRequest matRequest;
    protected MATResponse matResponse;
    protected BroadcastReceiver networkStateReceiver;
    public Parameters params;
    protected ExecutorService pubQueue;

    protected MobileAppTracker()
    {
    }

    public static void a(MobileAppTracker mobileapptracker, Object obj, JSONArray jsonarray, double d1, String s, String s1, String s2, 
            String s3)
    {
        mobileapptracker.a(obj, jsonarray, d1, s, s1, s2, s3, false);
    }

    private void a(Object obj, JSONArray jsonarray, double d1, String s, String s1, String s2, 
            String s3, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = initialized;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj1;
        dumpQueue();
        params.setAction("conversion");
        obj1 = new Date();
        if (!(obj instanceof String)) goto _L4; else goto _L3
_L3:
        if (obj.equals("close")) goto _L1; else goto _L5
_L5:
        if (!obj.equals("open") && !obj.equals("install") && !obj.equals("update") && !obj.equals("session")) goto _L7; else goto _L6
_L6:
        if (!flag) goto _L9; else goto _L8
_L8:
        params.setAction("install");
_L10:
        obj = new Date(((Date) (obj1)).getTime() + 5000L);
_L11:
        params.setRevenue(Double.toString(d1));
        if (d1 <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        params.setIsPayingUser(Integer.toString(1));
        params.setCurrencyCode(s);
        params.setRefId(s1);
        s = bog.a(d, e, flag);
        obj1 = bog.a();
        jsonarray = bog.a(jsonarray, s2, s3);
        if (matRequest != null)
        {
            matRequest.constructedRequest(s, ((String) (obj1)), jsonarray);
        }
        addEventToQueue(s, ((String) (obj1)), jsonarray, ((Date) (obj)));
        dumpQueue();
        if (matResponse != null)
        {
            matResponse.enqueuedActionWithRefId(s1);
        }
        params.resetAfterRequest();
          goto _L1
        obj;
        throw obj;
_L9:
        params.setAction("session");
          goto _L10
_L7:
        params.setEventName((String)obj);
        obj = obj1;
          goto _L11
_L4:
        if (!(obj instanceof Integer))
        {
            break MISSING_BLOCK_LABEL_323;
        }
        params.setEventId(Integer.toString(((Integer)obj).intValue()));
        obj = obj1;
          goto _L11
        Log.d("MobileAppTracker", "Received invalid event name or id value, not measuring event");
          goto _L1
    }

    public static boolean a(MobileAppTracker mobileapptracker, boolean flag)
    {
        mobileapptracker.d = flag;
        return flag;
    }

    public static MobileAppTracker b()
    {
        return g;
    }

    private void c()
    {
        Date date1 = null;
_L2:
        Date date;
label0:
        {
            if (params == null)
            {
                date = date1;
                if (date1 == null)
                {
                    date = new Date((new Date()).getTime() + 1000L);
                }
                if (!date.before(new Date()))
                {
                    break label0;
                }
                Log.w("MobileAppTracker", "after waiting 1 s, params is still null -- will probably lead to NullPointerException");
            }
            return;
        }
        Thread.sleep(50L);
        date1 = date;
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        interruptedexception = date;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static MobileAppTracker getInstance()
    {
        com/mobileapptracker/MobileAppTracker;
        JVM INSTR monitorenter ;
        MobileAppTracker mobileapptracker = g;
        com/mobileapptracker/MobileAppTracker;
        JVM INSTR monitorexit ;
        return mobileapptracker;
        Exception exception;
        exception;
        throw exception;
    }

    public static void init(Context context, String s, String s1)
    {
        MobileAppTracker mobileapptracker = new MobileAppTracker();
        g = mobileapptracker;
        mobileapptracker.mContext = context.getApplicationContext();
        g.pubQueue = Executors.newSingleThreadExecutor();
        g.pubQueue.execute(new bpa(s, s1));
    }

    public static boolean isOnline(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    final void a()
    {
        a("install", ((JSONArray) (null)), 0.0D, ((String) (null)), null, null, null, true);
    }

    protected void addEventToQueue(String s, String s1, JSONObject jsonobject, Date date)
    {
        ExecutorService executorservice = f;
        MATEventQueue mateventqueue = eventQueue;
        mateventqueue.getClass();
        executorservice.execute(new MATEventQueue.Add(mateventqueue, s, s1, jsonobject, date));
    }

    public void dumpQueue()
    {
        if (!isOnline(mContext))
        {
            return;
        } else
        {
            ExecutorService executorservice = f;
            MATEventQueue mateventqueue = eventQueue;
            mateventqueue.getClass();
            executorservice.execute(new MATEventQueue.Dump(mateventqueue));
            return;
        }
    }

    public String getAction()
    {
        c();
        return params.getAction();
    }

    public String getAdvertiserId()
    {
        c();
        return params.getAdvertiserId();
    }

    public int getAge()
    {
        c();
        return Integer.parseInt(params.getAge());
    }

    public double getAltitude()
    {
        c();
        return Double.parseDouble(params.getAltitude());
    }

    public boolean getAppAdTrackingEnabled()
    {
        c();
        return Integer.parseInt(params.getAppAdTrackingEnabled()) == 1;
    }

    public String getAppName()
    {
        c();
        return params.getAppName();
    }

    public int getAppVersion()
    {
        c();
        return Integer.parseInt(params.getAppVersion());
    }

    public String getConnectionType()
    {
        c();
        return params.getConnectionType();
    }

    public String getCountryCode()
    {
        c();
        return params.getCountryCode();
    }

    public String getCurrencyCode()
    {
        c();
        return params.getCurrencyCode();
    }

    public String getDeviceBrand()
    {
        c();
        return params.getDeviceBrand();
    }

    public String getDeviceCarrier()
    {
        c();
        return params.getDeviceCarrier();
    }

    public String getDeviceModel()
    {
        c();
        return params.getDeviceModel();
    }

    public String getEventAttribute1()
    {
        c();
        return params.getEventAttribute1();
    }

    public String getEventAttribute2()
    {
        c();
        return params.getEventAttribute2();
    }

    public String getEventAttribute3()
    {
        c();
        return params.getEventAttribute3();
    }

    public String getEventAttribute4()
    {
        c();
        return params.getEventAttribute4();
    }

    public String getEventAttribute5()
    {
        c();
        return params.getEventAttribute5();
    }

    public String getEventId()
    {
        c();
        return params.getEventId();
    }

    public String getEventName()
    {
        c();
        return params.getEventName();
    }

    public boolean getExistingUser()
    {
        c();
        return Integer.parseInt(params.getExistingUser()) == 1;
    }

    public String getFacebookUserId()
    {
        c();
        return params.getFacebookUserId();
    }

    public int getGender()
    {
        c();
        return Integer.parseInt(params.getGender());
    }

    public boolean getGoogleAdTrackingLimited()
    {
        c();
        return Integer.parseInt(params.getGoogleAdTrackingLimited()) != 0;
    }

    public String getGoogleAdvertisingId()
    {
        c();
        return params.getGoogleAdvertisingId();
    }

    public String getGoogleUserId()
    {
        c();
        return params.getGoogleUserId();
    }

    public long getInstallDate()
    {
        c();
        return Long.parseLong(params.getInstallDate());
    }

    public String getInstallLogId()
    {
        c();
        return params.getInstallLogId();
    }

    public String getInstallReferrer()
    {
        c();
        return params.getInstallReferrer();
    }

    public boolean getIsPayingUser()
    {
        c();
        return params.getIsPayingUser().equals("1");
    }

    public String getLanguage()
    {
        c();
        return params.getLanguage();
    }

    public String getLastOpenLogId()
    {
        c();
        return params.getLastOpenLogId();
    }

    public double getLatitude()
    {
        c();
        return Double.parseDouble(params.getLatitude());
    }

    public double getLongitude()
    {
        c();
        return Double.parseDouble(params.getLongitude());
    }

    public String getMCC()
    {
        c();
        return params.getMCC();
    }

    public String getMNC()
    {
        c();
        return params.getMNC();
    }

    public String getMatId()
    {
        c();
        return params.getMatId();
    }

    public String getOpenLogId()
    {
        c();
        return params.getOpenLogId();
    }

    public String getOsVersion()
    {
        c();
        return params.getOsVersion();
    }

    public String getPackageName()
    {
        c();
        return params.getPackageName();
    }

    public String getPluginName()
    {
        c();
        return params.getPluginName();
    }

    public String getRefId()
    {
        c();
        return params.getRefId();
    }

    public String getReferralSource()
    {
        c();
        return params.getReferralSource();
    }

    public String getReferralUrl()
    {
        c();
        return params.getReferralUrl();
    }

    public Double getRevenue()
    {
        c();
        return Double.valueOf(Double.parseDouble(params.getRevenue()));
    }

    public String getSDKVersion()
    {
        c();
        return params.getSdkVersion();
    }

    public String getScreenDensity()
    {
        c();
        return params.getScreenDensity();
    }

    public String getScreenHeight()
    {
        c();
        return params.getScreenHeight();
    }

    public String getScreenWidth()
    {
        c();
        return params.getScreenWidth();
    }

    public String getSiteId()
    {
        c();
        return params.getSiteId();
    }

    public String getTRUSTeId()
    {
        c();
        return params.getTRUSTeId();
    }

    public String getTwitterUserId()
    {
        c();
        return params.getTwitterUserId();
    }

    public String getUpdateLogId()
    {
        c();
        return params.getUpdateLogId();
    }

    public String getUserAgent()
    {
        c();
        return params.getUserAgent();
    }

    public String getUserEmail()
    {
        c();
        return params.getUserEmail();
    }

    public String getUserId()
    {
        c();
        return params.getUserId();
    }

    public String getUserName()
    {
        c();
        return params.getUserName();
    }

    public void initAll(String s, String s1)
    {
        Parameters.init(mContext, s, s1);
        params = Parameters.getInstance();
        f = Executors.newSingleThreadExecutor();
        b = new boz();
        c = new Encryption(s1.trim(), "heF9BATUfWuISyO8");
        initialized = false;
        isRegistered = false;
        d = false;
        e = false;
        eventQueue = new MATEventQueue(mContext, g);
        dumpQueue();
        networkStateReceiver = new bpl(this);
        if (isRegistered)
        {
            try
            {
                mContext.unregisterReceiver(networkStateReceiver);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            isRegistered = false;
        }
        s = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        mContext.registerReceiver(networkStateReceiver, s);
        isRegistered = true;
        initialized = true;
    }

    protected boolean makeRequest(String s, String s1, JSONObject jsonobject)
    {
        boolean flag;
        flag = false;
        if (d)
        {
            Log.d("MobileAppTracker", "Sending event to server...");
        }
        s1 = bog.a(s1, c);
        s = (new StringBuilder()).append(s).append("&data=").append(s1).toString();
        s = b.a(s, jsonobject, d);
        if (s != null) goto _L2; else goto _L1
_L1:
        if (matResponse != null)
        {
            matResponse.didFailWithError(s);
        }
_L4:
        return true;
_L2:
        if (!s.has("success"))
        {
            if (d)
            {
                Log.d("MobileAppTracker", "Request failed, event will remain in queue");
            }
            return false;
        }
        if (matResponse != null)
        {
            boolean flag1;
            try
            {
                flag1 = s.getString("success").equals("true");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return false;
            }
            if (flag1)
            {
                flag = true;
            }
            if (flag)
            {
                matResponse.didSucceedWithData(s);
            } else
            {
                matResponse.didFailWithError(s);
            }
        }
        try
        {
            if (s.getString("site_event_type").equals("open"))
            {
                s1 = s.getString("log_id");
                if (getOpenLogId() == null)
                {
                    params.setOpenLogId(s1);
                }
                params.setLastOpenLogId(s1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        if (!d) goto _L4; else goto _L3
_L3:
        Log.d("MobileAppTracker", (new StringBuilder("Server response: ")).append(s.toString()).toString());
        if (s.length() <= 0) goto _L4; else goto _L5
_L5:
        if (!s.has("log_action") || s.getString("log_action").equals("null"))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = s.getJSONObject("log_action");
        if (!s.has("conversion")) goto _L4; else goto _L6
_L6:
        s = s.getJSONObject("conversion");
        if (!s.has("status")) goto _L4; else goto _L7
_L7:
        if (!s.getString("status").equals("rejected"))
        {
            break MISSING_BLOCK_LABEL_394;
        }
        s = s.getString("status_code");
        Log.d("MobileAppTracker", (new StringBuilder("Event was rejected by server: status code ")).append(s).toString());
        return true;
        try
        {
            Log.d("MobileAppTracker", "Event was accepted by server");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d("MobileAppTracker", "Server response status could not be parsed");
            s.printStackTrace();
            return true;
        }
        return true;
        if (!s.has("options")) goto _L4; else goto _L8
_L8:
        s = s.getJSONObject("options");
        if (!s.has("conversion_status")) goto _L4; else goto _L9
_L9:
        s = s.getString("conversion_status");
        Log.d("MobileAppTracker", (new StringBuilder("Event was ")).append(s).append(" by server").toString());
        return true;
    }

    public void measureAction(int i)
    {
        measureAction(i, null, 0.0D, getCurrencyCode(), null, null, null);
    }

    public void measureAction(int i, double d1, String s)
    {
        measureAction(i, null, d1, s, null, null, null);
    }

    public void measureAction(int i, double d1, String s, String s1)
    {
        measureAction(i, null, d1, s, s1, null, null);
    }

    public void measureAction(int i, List list, double d1, String s, String s1)
    {
        measureAction(i, list, d1, s, s1, null, null);
    }

    public void measureAction(int i, List list, double d1, String s, String s1, String s2, 
            String s3)
    {
        JSONArray jsonarray = new JSONArray();
        if (list != null)
        {
            for (int j = 0; j < list.size(); j++)
            {
                jsonarray.put(((MATEventItem)list.get(j)).toJSON());
            }

        }
        pubQueue.execute(new bob(this, i, jsonarray, d1, s, s1, s2, s3));
    }

    public void measureAction(String s)
    {
        measureAction(s, null, 0.0D, getCurrencyCode(), null, null, null);
    }

    public void measureAction(String s, double d1, String s1)
    {
        measureAction(s, null, d1, s1, null, null, null);
    }

    public void measureAction(String s, double d1, String s1, String s2)
    {
        measureAction(s, null, d1, s1, s2, null, null);
    }

    public void measureAction(String s, List list, double d1, String s1, String s2)
    {
        measureAction(s, list, d1, s1, s2, null, null);
    }

    public void measureAction(String s, List list, double d1, String s1, String s2, String s3, 
            String s4)
    {
        JSONArray jsonarray = new JSONArray();
        if (list != null)
        {
            for (int i = 0; i < list.size(); i++)
            {
                jsonarray.put(((MATEventItem)list.get(i)).toJSON());
            }

        }
        pubQueue.execute(new bnq(this, s, jsonarray, d1, s1, s2, s3, s4));
    }

    public void measureSession()
    {
        pubQueue.execute(new bpw(this));
    }

    public void setAdvertiserSubAd(String s)
    {
        pubQueue.execute(new bon(this, s));
    }

    public void setAdvertiserSubAdgroup(String s)
    {
        pubQueue.execute(new bov(this, s));
    }

    public void setAdvertiserSubCampaign(String s)
    {
        pubQueue.execute(new bow(this, s));
    }

    public void setAdvertiserSubKeyword(String s)
    {
        pubQueue.execute(new box(this, s));
    }

    public void setAdvertiserSubPublisher(String s)
    {
        pubQueue.execute(new bpb(this, s));
    }

    public void setAdvertiserSubSite(String s)
    {
        pubQueue.execute(new bpc(this, s));
    }

    public void setAge(int i)
    {
        pubQueue.execute(new bpd(this, i));
    }

    public void setAllowDuplicates(boolean flag)
    {
        pubQueue.execute(new bot(this, flag));
    }

    public void setAltitude(double d1)
    {
        pubQueue.execute(new bpe(this, d1));
    }

    public void setAndroidId(String s)
    {
        pubQueue.execute(new bpf(this, s));
    }

    public void setAppAdTrackingEnabled(boolean flag)
    {
        pubQueue.execute(new bpg(this, flag));
    }

    public void setCurrencyCode(String s)
    {
        pubQueue.execute(new bph(this, s));
    }

    public void setDebugMode(boolean flag)
    {
        pubQueue.execute(new bou(this, flag));
    }

    public void setDeviceId(String s)
    {
        pubQueue.execute(new bpi(this, s));
    }

    public void setEventAttribute1(String s)
    {
        pubQueue.execute(new bps(this, s));
    }

    public void setEventAttribute2(String s)
    {
        pubQueue.execute(new bpt(this, s));
    }

    public void setEventAttribute3(String s)
    {
        pubQueue.execute(new bpu(this, s));
    }

    public void setEventAttribute4(String s)
    {
        pubQueue.execute(new bpv(this, s));
    }

    public void setEventAttribute5(String s)
    {
        pubQueue.execute(new bng(this, s));
    }

    public void setEventContentId(String s)
    {
        pubQueue.execute(new bpk(this, s));
    }

    public void setEventContentType(String s)
    {
        pubQueue.execute(new bpj(this, s));
    }

    public void setEventDate1(Date date)
    {
        pubQueue.execute(new bpq(this, date));
    }

    public void setEventDate2(Date date)
    {
        pubQueue.execute(new bpr(this, date));
    }

    public void setEventLevel(int i)
    {
        pubQueue.execute(new bpm(this, i));
    }

    public void setEventQuantity(int i)
    {
        pubQueue.execute(new bpn(this, i));
    }

    public void setEventRating(float f1)
    {
        pubQueue.execute(new bpp(this, f1));
    }

    public void setEventSearchString(String s)
    {
        pubQueue.execute(new bpo(this, s));
    }

    public void setExistingUser(boolean flag)
    {
        pubQueue.execute(new bnh(this, flag));
    }

    public void setFacebookUserId(String s)
    {
        pubQueue.execute(new bni(this, s));
    }

    public void setGender(int i)
    {
        pubQueue.execute(new bnj(this, i));
    }

    public void setGoogleAdvertisingId(String s, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        pubQueue.execute(new bnk(this, s, i));
    }

    public void setGoogleUserId(String s)
    {
        pubQueue.execute(new bnl(this, s));
    }

    public void setInstallReferrer(String s)
    {
        pubQueue.execute(new bnm(this, s));
    }

    public void setIsPayingUser(boolean flag)
    {
        pubQueue.execute(new bnn(this, flag));
    }

    public void setLatitude(double d1)
    {
        pubQueue.execute(new bno(this, d1));
    }

    public void setLocation(Location location)
    {
        pubQueue.execute(new bnp(this, location));
    }

    public void setLongitude(double d1)
    {
        pubQueue.execute(new bnr(this, d1));
    }

    public void setMATResponse(MATResponse matresponse)
    {
        matResponse = matresponse;
    }

    public void setMacAddress(String s)
    {
        pubQueue.execute(new bns(this, s));
    }

    public void setOfferId(String s)
    {
        pubQueue.execute(new bnt(this, s));
    }

    public void setPackageName(String s)
    {
        pubQueue.execute(new bnu(this, s));
    }

    public void setPluginName(String s)
    {
        if (Arrays.asList(bnf.a).contains(s))
        {
            pubQueue.execute(new bos(this, s));
        } else
        if (d)
        {
            throw new IllegalArgumentException("Plugin name not acceptable");
        }
    }

    public void setPublisherId(String s)
    {
        e = true;
        pubQueue.execute(new bnv(this, s));
    }

    public void setPublisherReferenceId(String s)
    {
        pubQueue.execute(new bnw(this, s));
    }

    public void setPublisherSub1(String s)
    {
        pubQueue.execute(new boe(this, s));
    }

    public void setPublisherSub2(String s)
    {
        pubQueue.execute(new bof(this, s));
    }

    public void setPublisherSub3(String s)
    {
        pubQueue.execute(new boh(this, s));
    }

    public void setPublisherSub4(String s)
    {
        pubQueue.execute(new boi(this, s));
    }

    public void setPublisherSub5(String s)
    {
        pubQueue.execute(new boj(this, s));
    }

    public void setPublisherSubAd(String s)
    {
        pubQueue.execute(new bnx(this, s));
    }

    public void setPublisherSubAdgroup(String s)
    {
        pubQueue.execute(new bny(this, s));
    }

    public void setPublisherSubCampaign(String s)
    {
        pubQueue.execute(new bnz(this, s));
    }

    public void setPublisherSubKeyword(String s)
    {
        pubQueue.execute(new boa(this, s));
    }

    public void setPublisherSubPublisher(String s)
    {
        pubQueue.execute(new boc(this, s));
    }

    public void setPublisherSubSite(String s)
    {
        pubQueue.execute(new bod(this, s));
    }

    public void setReferralSources(Activity activity)
    {
        pubQueue.execute(new bok(this, activity));
    }

    public void setSiteId(String s)
    {
        pubQueue.execute(new bol(this, s));
    }

    public void setTRUSTeId(String s)
    {
        pubQueue.execute(new bom(this, s));
    }

    public void setTwitterUserId(String s)
    {
        pubQueue.execute(new boo(this, s));
    }

    public void setUserEmail(String s)
    {
        pubQueue.execute(new bop(this, s));
    }

    public void setUserId(String s)
    {
        pubQueue.execute(new boq(this, s));
    }

    public void setUserName(String s)
    {
        pubQueue.execute(new bor(this, s));
    }

}
