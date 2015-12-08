.class Lcom/google/android/gms/drive/internal/zzy$zzb;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/DrivePreferencesApi$FileUploadPreferencesResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/zzy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "zzb"
.end annotation


# instance fields
.field private final zzOt:Lcom/google/android/gms/common/api/Status;

.field final synthetic zzafu:Lcom/google/android/gms/drive/internal/zzy;

.field private final zzafw:Lcom/google/android/gms/drive/FileUploadPreferences;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/drive/internal/zzy;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/FileUploadPreferences;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzy$zzb;->zzafu:Lcom/google/android/gms/drive/internal/zzy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/zzy$zzb;->zzOt:Lcom/google/android/gms/common/api/Status;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/zzy$zzb;->zzafw:Lcom/google/android/gms/drive/FileUploadPreferences;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/drive/internal/zzy;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/FileUploadPreferences;Lcom/google/android/gms/drive/internal/zzy$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/drive/internal/zzy$zzb;-><init>(Lcom/google/android/gms/drive/internal/zzy;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/FileUploadPreferences;)V

    return-void
.end method


# virtual methods
.method public getFileUploadPreferences()Lcom/google/android/gms/drive/FileUploadPreferences;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzy$zzb;->zzafw:Lcom/google/android/gms/drive/FileUploadPreferences;

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzy$zzb;->zzOt:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
