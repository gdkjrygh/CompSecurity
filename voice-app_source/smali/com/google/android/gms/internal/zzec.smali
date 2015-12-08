.class public final Lcom/google/android/gms/internal/zzec;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzec$zza;
    }
.end annotation


# instance fields
.field public final zzxY:I

.field public final zzxZ:Lcom/google/android/gms/internal/zzdx;

.field public final zzya:Lcom/google/android/gms/internal/zzeg;

.field public final zzyb:Ljava/lang/String;

.field public final zzyc:Lcom/google/android/gms/internal/zzea;


# direct methods
.method public constructor <init>(I)V
    .locals 6

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzec;-><init>(Lcom/google/android/gms/internal/zzdx;Lcom/google/android/gms/internal/zzeg;Ljava/lang/String;Lcom/google/android/gms/internal/zzea;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzdx;Lcom/google/android/gms/internal/zzeg;Ljava/lang/String;Lcom/google/android/gms/internal/zzea;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzec;->zzxZ:Lcom/google/android/gms/internal/zzdx;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzec;->zzya:Lcom/google/android/gms/internal/zzeg;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzec;->zzyb:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzec;->zzyc:Lcom/google/android/gms/internal/zzea;

    iput p5, p0, Lcom/google/android/gms/internal/zzec;->zzxY:I

    return-void
.end method
