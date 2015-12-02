// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.CnLocation;
import com.ubercab.client.core.model.Note;
import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import com.ubercab.rider.realtime.model.UpfrontFare;
import java.util.List;

public interface dkn
{

    public abstract void a();

    public abstract void a(int l, long l1, CnLocation cnlocation, CnLocation cnlocation1, FareInfo fareinfo, int i1);

    public abstract void a(CnLocation cnlocation, CnLocation cnlocation1, CnLocation cnlocation2, int l, long l1, String s, 
            boolean flag, boolean flag1, boolean flag2, TripExpenseInfo tripexpenseinfo, String s1, List list, boolean flag3, 
            UpfrontFare upfrontfare, int i1, Profile profile, Note note, boolean flag4);

    public abstract void a(Profile profile);

    public abstract void a(TripExpenseInfo tripexpenseinfo);

    public abstract void a(String s);

    public abstract void a(String s, int l, int i1, String s1);

    public abstract void a(String s, gqk gqk);

    public abstract void a(String s, Boolean boolean1, Boolean boolean2);

    public abstract void a(String s, String s1);

    public abstract void a(String s, String s1, gqk gqk);

    public abstract void a(String s, String s1, String s2, gqk gqk);

    public abstract void a(String s, String s1, String s2, String s3);

    public abstract void a(String s, String s1, String s2, String s3, String s4, String s5, String s6);

    public abstract void a(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            boolean flag, boolean flag1);

    public abstract void a(String s, String s1, boolean flag);

    public abstract void a(String s, boolean flag);

    public abstract void a(String s, boolean flag, String s1);

    public abstract void a(List list);

    public abstract void a(boolean flag);

    public abstract void b();

    public abstract void b(String s);

    public abstract void b(String s, String s1);

    public abstract void b(boolean flag);

    public abstract void c();

    public abstract void c(String s);

    public abstract void c(String s, String s1);

    public abstract void d();

    public abstract void d(String s);

    public abstract void d(String s, String s1);

    public abstract void e();

    public abstract void e(String s);

    public abstract void e(String s, String s1);

    public abstract void f();

    public abstract void f(String s);

    public abstract void f(String s, String s1);

    public abstract void g(String s, String s1);

    public abstract void h(String s, String s1);

    public abstract void i(String s, String s1);

    public abstract void j(String s, String s1);

    public abstract void k(String s, String s1);
}
