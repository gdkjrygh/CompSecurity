.class public final Lcom/google/android/gms/internal/zzha$zza;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzha;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation


# instance fields
.field public final errorCode:I

.field public final zzFl:Lorg/json/JSONObject;

.field public final zzFm:Lcom/google/android/gms/internal/zzdy;

.field public final zzFo:J

.field public final zzFp:J

.field public final zzFr:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

.field public final zzFs:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

.field public final zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/internal/zzdy;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;IJJLorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzha$zza;->zzFr:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzha$zza;->zzFs:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzha$zza;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzha$zza;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput p5, p0, Lcom/google/android/gms/internal/zzha$zza;->errorCode:I

    iput-wide p6, p0, Lcom/google/android/gms/internal/zzha$zza;->zzFo:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/zzha$zza;->zzFp:J

    iput-object p10, p0, Lcom/google/android/gms/internal/zzha$zza;->zzFl:Lorg/json/JSONObject;

    return-void
.end method
