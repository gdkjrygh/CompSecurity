.class public final Lcom/google/android/gms/internal/zzax;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private final zzqo:Ljava/lang/String;

.field private final zzqp:Lorg/json/JSONObject;

.field private final zzqq:Ljava/lang/String;

.field private final zzqr:Ljava/lang/String;

.field private final zzqs:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Lorg/json/JSONObject;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->zzGG:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzax;->zzqr:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzax;->zzqp:Lorg/json/JSONObject;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzax;->zzqq:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzax;->zzqo:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zzax;->zzqs:Z

    return-void
.end method


# virtual methods
.method public zzbQ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzax;->zzqo:Ljava/lang/String;

    return-object v0
.end method

.method public zzbR()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzax;->zzqr:Ljava/lang/String;

    return-object v0
.end method

.method public zzbS()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzax;->zzqp:Lorg/json/JSONObject;

    return-object v0
.end method

.method public zzbT()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzax;->zzqq:Ljava/lang/String;

    return-object v0
.end method

.method public zzbU()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzax;->zzqs:Z

    return v0
.end method
