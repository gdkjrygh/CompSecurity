// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import android.util.Log;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.weather.dal2.data.Record;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.json.JsonUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.dal2.dsx:
//            RecordsJsonMapper, MoDsxRecord, DsxRecord, BeRecord, 
//            DfRecord, DhRecord, DiRecord, Breathing, 
//            FluRecord, Pollen, SKResorts, TiRecord, 
//            WmRecord, AirportDelaysRecord, WhenWillRainRecord

public class RecordSets
{

    private static final String TAG = "RecordSets";
    private static final transient List normallyEmptyRecords = ImmutableList.of("BERecord", "TIRecord", "WMRecord", "SkiResorts");
    private transient long creationTimeStamp;
    private transient boolean fromManualRefresh;
    private transient boolean fromStaleData;
    private transient RecordSetsSource recordSetsSource;
    private transient List records;
    public BeRecord wxdv2BERecord;
    public DfRecord wxdv2DFRecord;
    public DhRecord wxdv2DHRecord;
    public DiRecord wxdv2DIRecord;
    public Breathing wxdv2IDRecord;
    public MoDsxRecord wxdv2MORecord;
    public FluRecord wxdv2PastFlu;
    public Pollen wxdv2Pollen;
    public SKResorts wxdv2SkiResorts;
    public TiRecord wxdv2TIRecord;
    public WmRecord wxdv2WMRecord;
    public AirportDelaysRecord wxdv2airportDelays;
    public WhenWillRainRecord wxdv2wwir;

    public RecordSets()
    {
    }

    public static RecordSets create(RecordSets recordsets, RecordSetsSource recordsetssource)
    {
        Preconditions.checkNotNull(recordsets);
        Preconditions.checkNotNull(recordsetssource);
        RecordSets recordsets1 = new RecordSets();
        recordsets1.wxdv2PastFlu = recordsets.wxdv2PastFlu;
        recordsets1.wxdv2SkiResorts = recordsets.wxdv2SkiResorts;
        recordsets1.wxdv2MORecord = recordsets.wxdv2MORecord;
        recordsets1.wxdv2DIRecord = recordsets.wxdv2DIRecord;
        recordsets1.wxdv2DFRecord = recordsets.wxdv2DFRecord;
        recordsets1.wxdv2DHRecord = recordsets.wxdv2DHRecord;
        recordsets1.wxdv2BERecord = recordsets.wxdv2BERecord;
        recordsets1.wxdv2Pollen = recordsets.wxdv2Pollen;
        recordsets1.wxdv2airportDelays = recordsets.wxdv2airportDelays;
        recordsets1.wxdv2TIRecord = recordsets.wxdv2TIRecord;
        recordsets1.wxdv2WMRecord = recordsets.wxdv2WMRecord;
        recordsets1.wxdv2wwir = recordsets.wxdv2wwir;
        recordsets1.records = recordsets.records;
        recordsets1.creationTimeStamp = recordsets.creationTimeStamp;
        recordsets1.fromStaleData = recordsets.fromStaleData;
        recordsets1.fromManualRefresh = recordsets.fromManualRefresh;
        recordsets1.wxdv2IDRecord = recordsets.wxdv2IDRecord;
        recordsets1.recordSetsSource = recordsetssource;
        return recordsets1;
    }

    public static RecordSets create(String s, boolean flag, boolean flag1)
    {
    /* block-local class not found */
    class RecordSetsSource {}

        return create(s, flag, flag1, RecordSetsSource.UNKNOWN);
    }

    public static RecordSets create(String s, boolean flag, boolean flag1, RecordSetsSource recordsetssource)
    {
        RecordSets recordsets;
        Preconditions.checkNotNull(recordsetssource);
        recordsets = null;
        RecordSets recordsets1 = (RecordSets)RecordsJsonMapper.fromJson(s, com/weather/dal2/dsx/RecordSets);
        recordsets = recordsets1;
        if (recordsets1 == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        recordsets = recordsets1;
        recordsets1.setRecordObjects();
        recordsets = recordsets1;
        if (recordsets1.hasNullRecordObjects())
        {
            return null;
        }
        recordsets = recordsets1;
        recordsets1.normalize();
        recordsets = recordsets1;
        if (recordsets1.isUnusableData())
        {
            return null;
        }
        recordsets = recordsets1;
        recordsets1.creationTimeStamp = System.currentTimeMillis();
        recordsets = recordsets1;
        recordsets1.fromStaleData = flag;
        recordsets = recordsets1;
        recordsets1.fromManualRefresh = flag1;
        recordsets = recordsets1;
        recordsets1.postParsingInitialize();
        recordsets = recordsets1;
        recordsets1.recordSetsSource = recordsetssource;
        return recordsets1;
        recordsetssource;
        EventLog.e("RecordSets", (new StringBuilder()).append("length: ").append(s.length()).append(" isFromStaleData: ").append(flag).append(' ').append(recordsetssource).append(" json: ").append(s.substring(0, Math.min(s.length(), 100))).toString());
        Log.e("RecordSets", (new StringBuilder()).append("length: ").append(s.length()).append(" isFromStaleData=").append(flag).append(", ").append(recordsetssource).append(" json: (only visible at debug level) ").toString());
        JsonUtil.logPretty("RecordSets", LoggingMetaTags.TWC_DAL, s);
        return recordsets;
    }

    private int getIndex(String s)
    {
        return !wxdv2MORecord.getId().endsWith(s) ? -1 : 0;
    }

    private boolean hasNullRecordObjects()
    {
        for (Iterator iterator = records.iterator(); iterator.hasNext();)
        {
            if ((DsxRecord)iterator.next() == null)
            {
                return true;
            }
        }

        return false;
    }

    private boolean isEmptyOrBad(DsxRecord dsxrecord)
    {
        int i = dsxrecord.getStatus().intValue();
        return i != 200 && (i != 204 || !isNormallyEmptyRecord(dsxrecord.getId()));
    }

    private static boolean isNormallyEmptyRecord(String s)
    {
        for (Iterator iterator = normallyEmptyRecords.iterator(); iterator.hasNext();)
        {
            if (s.contains((String)iterator.next()))
            {
                return true;
            }
        }

        return false;
    }

    private void normalize()
    {
        for (Iterator iterator = records.iterator(); iterator.hasNext(); ((DsxRecord)iterator.next()).normalize()) { }
    }

    private void postParsingInitialize()
    {
        for (Iterator iterator = records.iterator(); iterator.hasNext(); ((DsxRecord)iterator.next()).postParsingInitializer(this)) { }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RecordSets)obj;
            if (!Objects.equal(wxdv2MORecord, ((RecordSets) (obj)).wxdv2MORecord) || !Objects.equal(wxdv2DIRecord, ((RecordSets) (obj)).wxdv2DIRecord) || !Objects.equal(wxdv2DFRecord, ((RecordSets) (obj)).wxdv2DFRecord) || !Objects.equal(wxdv2DHRecord, ((RecordSets) (obj)).wxdv2DHRecord) || !Objects.equal(wxdv2BERecord, ((RecordSets) (obj)).wxdv2BERecord) || !Objects.equal(wxdv2IDRecord, ((RecordSets) (obj)).wxdv2IDRecord) || !Objects.equal(wxdv2Pollen, ((RecordSets) (obj)).wxdv2Pollen) || !Objects.equal(wxdv2airportDelays, ((RecordSets) (obj)).wxdv2airportDelays) || !Objects.equal(wxdv2TIRecord, ((RecordSets) (obj)).wxdv2TIRecord) || !Objects.equal(wxdv2WMRecord, ((RecordSets) (obj)).wxdv2WMRecord) || !Objects.equal(wxdv2PastFlu, ((RecordSets) (obj)).wxdv2PastFlu) || !Objects.equal(wxdv2wwir, ((RecordSets) (obj)).wxdv2wwir) || !Objects.equal(wxdv2SkiResorts, ((RecordSets) (obj)).wxdv2SkiResorts))
            {
                return false;
            }
        }
        return true;
    }

    public AirportDelaysRecord getAirportDelayRecord()
    {
        return wxdv2airportDelays;
    }

    public BeRecord getBeRecord()
    {
        return wxdv2BERecord;
    }

    public Breathing getBreathingRecord()
    {
        return wxdv2IDRecord;
    }

    public long getCreationTimeStamp()
    {
        return creationTimeStamp;
    }

    public DfRecord getDfRecord()
    {
        return wxdv2DFRecord;
    }

    public DhRecord getDhRecord()
    {
        return wxdv2DHRecord;
    }

    public DiRecord getDiRecord()
    {
        return wxdv2DIRecord;
    }

    public FluRecord getFluRecord()
    {
        return wxdv2PastFlu;
    }

    public MoDsxRecord getMoRecord()
    {
        return wxdv2MORecord;
    }

    public Pollen getPollenRecord()
    {
        return wxdv2Pollen;
    }

    public SKResorts getSkiResorts()
    {
        return wxdv2SkiResorts;
    }

    public RecordSetsSource getSource()
    {
        return recordSetsSource;
    }

    public TiRecord getTiRecord()
    {
        return wxdv2TIRecord;
    }

    public WhenWillRainRecord getWWITRecord()
    {
        return wxdv2wwir;
    }

    public WmRecord getWmRecord()
    {
        return wxdv2WMRecord;
    }

    public boolean hasBadOrEmptyRecords()
    {
        boolean flag1 = false;
        Iterator iterator = records.iterator();
        boolean flag;
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            if (!isEmptyOrBad((DsxRecord)iterator.next()))
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        if (flag)
        {
            LogUtil.d("RecordSets", LoggingMetaTags.TWC_DAL_WXD, "Has some bad or empty records", new Object[0]);
        }
        return flag;
    }

    public boolean hasDataFor(SavedLocation savedlocation)
        throws IllegalArgumentException, IllegalStateException
    {
        for (String s = wxdv2MORecord.getId(); s == null || savedlocation == null || !s.endsWith(savedlocation.getLatLong()) && !s.endsWith(savedlocation.getKeyTypeCountry());)
        {
            return false;
        }

        return true;
    }

    public int hashCode()
    {
        return 42;
    }

    public boolean isFromStaleData()
    {
        return fromStaleData;
    }

    public boolean isUnusableData()
    {
        boolean flag1 = true;
        Iterator iterator = records.iterator();
        boolean flag;
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            if (isEmptyOrBad((DsxRecord)iterator.next()))
            {
                continue;
            }
            flag = false;
            break;
        } while (true);
        if (flag)
        {
            EventLog.w("RecordSets", "Unusable Data");
        }
        return flag;
    }

    public void replaceBadOrEmptyRecords(RecordSets recordsets)
    {
        if (wxdv2MORecord != null && recordsets.getIndex(wxdv2MORecord.getLocationIdentifier()) != -1)
        {
            int i = 0;
            int j = records.size();
            while (i < j) 
            {
                Record record = (Record)records.get(i);
                DsxRecord dsxrecord = (DsxRecord)recordsets.records.get(i);
                Integer integer = record.getStatus();
                if (integer.intValue() != 200 && (!isNormallyEmptyRecord(record.getId()) || integer.intValue() != 204))
                {
                    records.set(i, dsxrecord);
                }
                i++;
            }
        }
    }

    public void setRecordObjects()
    {
        records = Lists.newArrayList(new DsxRecord[] {
            wxdv2MORecord, wxdv2wwir, wxdv2SkiResorts, wxdv2PastFlu, wxdv2DIRecord, wxdv2DFRecord, wxdv2DHRecord, wxdv2BERecord, wxdv2Pollen, wxdv2IDRecord, 
            wxdv2airportDelays, wxdv2TIRecord, wxdv2WMRecord
        });
    }

    public String toString()
    {
        if (wxdv2MORecord == null)
        {
            return "";
        } else
        {
            return (new StringBuilder()).append("RecordSets: ").append(wxdv2MORecord.getLocationIdentifier()).toString();
        }
    }

    public boolean wasTriggeredByManualRefresh()
    {
        return fromManualRefresh;
    }

}
