.class Lcom/google/android/gms/internal/zzdh$zzc;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzdh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "zzc"
.end annotation


# instance fields
.field final synthetic zzwi:Lcom/google/android/gms/internal/zzdh;

.field private final zzwp:Lcom/google/android/gms/internal/zzdh$zzd;

.field private final zzwq:Z

.field private final zzwr:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzdh;ZLcom/google/android/gms/internal/zzdh$zzd;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdh$zzc;->zzwi:Lcom/google/android/gms/internal/zzdh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zzdh$zzc;->zzwq:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/zzdh$zzc;->zzwp:Lcom/google/android/gms/internal/zzdh$zzd;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzdh$zzc;->zzwr:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdh$zzc;->zzwr:Ljava/lang/String;

    return-object v0
.end method

.method public isSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzdh$zzc;->zzwq:Z

    return v0
.end method

.method public zzdN()Lcom/google/android/gms/internal/zzdh$zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdh$zzc;->zzwp:Lcom/google/android/gms/internal/zzdh$zzd;

    return-object v0
.end method
