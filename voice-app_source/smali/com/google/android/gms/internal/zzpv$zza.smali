.class public final Lcom/google/android/gms/internal/zzpv$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzpv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation


# instance fields
.field private zzaOS:Z

.field private zzaOT:Z

.field private final zzaOU:Ljava/lang/String;

.field private zztd:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzpv$zza;->zzaOS:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzpv$zza;->zzaOT:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpv$zza;->zzaOU:Ljava/lang/String;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzpv$zza;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpv$zza;->zzaOU:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzpv$zza;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpv$zza;->zzaOS:Z

    return v0
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/zzpv$zza;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpv$zza;->zzaOT:Z

    return v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/zzpv$zza;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpv$zza;->zztd:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public zzap(Z)Lcom/google/android/gms/internal/zzpv$zza;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzpv$zza;->zzaOS:Z

    return-object p0
.end method

.method public zzaq(Z)Lcom/google/android/gms/internal/zzpv$zza;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzpv$zza;->zzaOT:Z

    return-object p0
.end method

.method public zzeS(Ljava/lang/String;)Lcom/google/android/gms/internal/zzpv$zza;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpv$zza;->zztd:Ljava/lang/String;

    return-object p0
.end method

.method public zzzW()Lcom/google/android/gms/internal/zzpv;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzpv;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/zzpv;-><init>(Lcom/google/android/gms/internal/zzpv$zza;Lcom/google/android/gms/internal/zzpv$1;)V

    return-object v0
.end method
