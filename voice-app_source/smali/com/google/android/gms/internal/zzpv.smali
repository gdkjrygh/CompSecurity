.class public final Lcom/google/android/gms/internal/zzpv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzpv$1;,
        Lcom/google/android/gms/internal/zzpv$zza;
    }
.end annotation


# instance fields
.field private final zzaOS:Z

.field private final zzaOT:Z

.field private final zzaOU:Ljava/lang/String;

.field private final zztd:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zzpv$zza;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/zzpv$zza;->zza(Lcom/google/android/gms/internal/zzpv$zza;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaOU:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzpv$zza;->zzb(Lcom/google/android/gms/internal/zzpv$zza;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaOS:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/zzpv$zza;->zzc(Lcom/google/android/gms/internal/zzpv$zza;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaOT:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/zzpv$zza;->zzd(Lcom/google/android/gms/internal/zzpv$zza;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpv;->zztd:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/zzpv$zza;Lcom/google/android/gms/internal/zzpv$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzpv;-><init>(Lcom/google/android/gms/internal/zzpv$zza;)V

    return-void
.end method


# virtual methods
.method public getTrackingId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpv;->zztd:Ljava/lang/String;

    return-object v0
.end method

.method public zzzT()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaOU:Ljava/lang/String;

    return-object v0
.end method

.method public zzzU()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaOS:Z

    return v0
.end method

.method public zzzV()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaOT:Z

    return v0
.end method
