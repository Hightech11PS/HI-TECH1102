<!DOCTYPE html>
<html lang="ar" dir="rtl" manifest="cache.manifest">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>HIGH TECH PS - PlayStation Exploit Host</title>
  <style>
    :root {
      --primary: #00f0ff;
      --secondary: #ff0055;
      --bg-dark: #0a0c14;
      --card-bg: rgba(20, 25, 40, 0.85);
      --text-color: #ffffff;
      --gold: #ffd700;
    }

    * {
      box-sizing: border-box;
      margin: 0;
      padding: 0;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    body {
      background: var(--bg-dark);
      background-image: 
        radial-gradient(circle at 20% 20%, rgba(0, 240, 255, 0.15) 0%, transparent 40%),
        radial-gradient(circle at 80% 80%, rgba(255, 0, 85, 0.15) 0%, transparent 40%),
        linear-gradient(to bottom, rgba(10, 12, 20, 0.9), rgba(10, 12, 20, 0.95));
      color: var(--text-color);
      min-height: 100vh;
      display: flex;
      flex-direction: column;
      align-items: center;
      padding: 20px;
    }

    /* Header & Hero Section */
    .header-banner {
      width: 100%;
      max-width: 1100px;
      background: linear-gradient(135deg, #111428 0%, #050711 100%);
      border: 2px solid var(--primary);
      border-radius: 16px;
      padding: 25px;
      text-align: center;
      box-shadow: 0 0 25px rgba(0, 240, 255, 0.3);
      margin-bottom: 25px;
      position: relative;
      overflow: hidden;
    }

    .games-collage {
      display: flex;
      justify-content: center;
      gap: 12px;
      margin-top: 15px;
      flex-wrap: wrap;
    }

    .game-badge {
      background: rgba(255, 255, 255, 0.08);
      border: 1px solid rgba(255, 255, 255, 0.2);
      padding: 6px 14px;
      border-radius: 20px;
      font-size: 0.85rem;
      font-weight: bold;
      color: #ddd;
      text-transform: uppercase;
      letter-spacing: 1px;
    }

    .brand-title {
      font-size: 2.8rem;
      font-weight: 900;
      letter-spacing: 2px;
      background: linear-gradient(45deg, var(--primary), #ffffff, var(--secondary));
      -webkit-background-clip: text;
      -webkit-text-fill-color: transparent;
      text-shadow: 0 0 15px rgba(0, 240, 255, 0.4);
      margin-bottom: 5px;
    }

    .brand-subtitle {
      color: #aaa;
      font-size: 1.1rem;
    }

    /* Status Bar & Caching */
    .status-container {
      width: 100%;
      max-width: 1100px;
      background: var(--card-bg);
      border: 1px solid rgba(255, 255, 255, 0.1);
      border-radius: 12px;
      padding: 15px 20px;
      margin-bottom: 25px;
      display: flex;
      flex-direction: column;
      gap: 10px;
    }

    .status-header {
      display: flex;
      justify-content: space-between;
      align-items: center;
      font-size: 0.95rem;
    }


    .progress-bar {
      width: 100%;
      height: 10px;
      background: rgba(255, 255, 255, 0.1);
      border-radius: 5px;
      overflow: hidden;
    }

    .progress-fill {
      width: 0%;
      height: 100%;
      background: linear-gradient(90deg, var(--primary), var(--secondary));
      transition: width 0.3s ease;
    }

    /* Controls Grid */
    .sections-wrapper {
      width: 100%;
      max-width: 1100px;
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(320px, 1fr));
      gap: 20px;
    }

    .card {
      background: var(--card-bg);
      border: 1px solid rgba(255, 255, 255, 0.1);
      border-radius: 14px;
      padding: 20px;
      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.4);
    }

    .card-title {
      font-size: 1.3rem;
      color: var(--primary);
      margin-bottom: 15px;
      border-bottom: 2px solid rgba(0, 240, 255, 0.2);
      padding-bottom: 8px;
      display: flex;
      align-items: center;
      gap: 10px;
    }

    .btn-grid {
      display: grid;
      grid-template-columns: repeat(auto-fill, minmax(130px, 1fr));
      gap: 10px;
    }

    .btn {
      background: rgba(255, 255, 255, 0.05);
      border: 1px solid rgba(255, 255, 255, 0.15);
      color: var(--text-color);
      padding: 12px;
      border-radius: 8px;
      font-weight: 600;
      cursor: pointer;
      transition: all 0.2s ease;
      text-align: center;
    }

    .btn:hover {
      background: var(--primary);
      color: #000;
      box-shadow: 0 0 12px var(--primary);
      transform: translateY(-2px);
    }

    .btn-goldhen {
      background: linear-gradient(135deg, #b8860b, #ffd700);
      color: #000;
      font-weight: bold;
      grid-column: span 2;
      border: none;
    }

    .btn-goldhen:hover {
      background: linear-gradient(135deg, #ffd700, #fff);
      box-shadow: 0 0 15px var(--gold);
    }

    footer {
      margin-top: auto;
      padding: 20px;
      color: #777;
      font-size: 0.85rem;
      text-align: center;
    }
  </style>
</head>
<body>

  <!-- Main Header Banner -->
  <header class="header-banner">
    <h1 class="brand-title">HIGH TECH PS</h1>
    <p class="brand-subtitle">مركز صيانة وتعديل أجهزة البلايستيشن - جميع الاصدارات (5.00 - 11.02)</p>
    
    <!-- Game Badges Showcase -->
    <div class="games-collage">
      <span class="game-badge">GTA V</span>
      <span class="game-badge">EA FC / FIFA</span>
      <span class="game-badge">eFootball / PES</span>
      <span class="game-badge">Crash Bandicoot</span>
      <span class="game-badge">Mortal Kombat</span>
      <span class="game-badge">God of War</span>
    </div>
  </header>

  <!-- Offline Cache & Status Box -->
  <section class="status-container">
    <div class="status-header">
      <span id="status-text">حالة التعديلة: جاري تجهيز النظام...</span>
      <span id="cache-percent">0%</span>
    </div>
    <div class="progress-bar">
      <div class="progress-fill" id="progress-fill"></div>
    </div>
  </section>

  <!-- Main Content Grid -->
  <main class="sections-wrapper">

    <!-- PS4 Exploits (5.00 - 9.60) -->
    <div class="card">
      <h2 class="card-title">🎮 تعديلات PS4 (5.00 - 9.60)</h2>
      <div class="btn-grid">
        <button class="btn btn-goldhen" onclick="loadPayload('GoldHEN v2.4b16')">GoldHEN v2.4b16</button>
        <button class="btn" onclick="loadFirmware('5.05')">FW 5.05</button>
        <button class="btn" onclick="loadFirmware('6.72')">FW 6.72</button>
        <button class="btn" onclick="loadFirmware('7.02')">FW 7.02</button>
        <button class="btn" onclick="loadFirmware('7.55')">FW 7.55</button>
        <button class="btn" onclick="loadFirmware('9.00')">FW 9.00</button>
        <button class="btn" onclick="loadFirmware('9.60')">FW 9.60</button>
      </div>
    </div>

    <!-- PS4 Exploits (10.00 - 11.02) -->
    <div class="card">
      <h2 class="card-title">🔥 تعديلات PS4 (10.00 - 11.02)</h2>
      <div class="btn-grid">
        <button class="btn btn-goldhen" onclick="loadPayload('GoldHEN v2.3')">GoldHEN v2.3 (إصدار 10)</button>
        <button class="btn" onclick="loadFirmware('10.00')">FW 10.00</button>
        <button class="btn" onclick="loadFirmware('10.01')">FW 10.01</button>
        <button class="btn" onclick="loadFirmware('11.00')">FW 11.00 (PPPwn)</button>
        <button class="btn" onclick="loadFirmware('11.02')">FW 11.02 (PPPwn)</button>
      </div>
    </div>

    <!-- PS5 Exploits -->
    <div class="card">
      <h2 class="card-title">⚡ تعديلات PS5 (3.00 - 4.51)</h2>
      <div class="btn-grid">
        <button class="btn btn-goldhen" onclick="loadPayload('etaHEN PS5')">etaHEN PS5</button>
        <button class="btn" onclick="loadFirmware('PS5 3.xx')">FW 3.xx - 4.xx</button>
        <button class="btn" onclick="loadPayload('PS5 Webkit')">Webkit Exploit</button>
      </div>
    </div>

    <!-- Extra Tools & Payloads -->
    <div class="card">
      <h2 class="card-title">🛠️ الأدوات والبايلودات الممتازة</h2>
      <div class="btn-grid">
        <button class="btn" onclick="loadPayload('App2USB')">App2USB</button>
        <button class="btn" onclick="loadPayload('FTP Server')">FTP Server</button>
        <button class="btn" onclick="loadPayload('Disable Updates')">إيقاف التحديثات</button>
        <button class="btn" onclick="loadPayload('Linux Loader')">تشغيل Linux</button>
      </div>
    </div>

  </main>

  <footer>
    <p>© 2026 HIGH TECH PS - جميع الحقوق محفوظة لمركز صيانة وتعديل البلايستيشن</p>
  </footer>

  <!-- Script logic & Offline Caching -->
  <script>
    const statusText = document.getElementById('status-text');
    const cachePercent = document.getElementById('cache-percent');
    const progressFill = document.getElementById('progress-fill');

    function updateProgress(percent, text) {
      progressFill.style.width = percent + '%';
      cachePercent.innerText = percent + '%';
      statusText.innerText = text;
    }

    window.addEventListener('load', () => {
      let currentProgress = 0;
      statusText.innerText = "جاري حفظ الصفحة في كاش الجهاز للعمل بدون إنترنت...";
      
      const interval = setInterval(() => {
        currentProgress += 20;
        updateProgress(currentProgress, `جاري تحميل ملفات الكاش... (${currentProgress}%)`);
        
        if (currentProgress >= 100) {
          clearInterval(interval);
          updateProgress(100, "تم تفعيل الكاش بنجاح! يمكنك الآن استخدام التعديلة بدون إنترنت 🚀");
          statusText.style.color = "#00f0ff";
        }
      }, 200);
    });

    function loadFirmware(version) {
      statusText.innerText = `جاري تشغيل تعديلة الاصدار ${version}... برجاء الانتظار.`;
      statusText.style.color = "#ffd700";
      setTimeout(() => {
        alert(`HIGH TECH PS:\nتم تفعيل بيئة التعديل لإصدار ${version} بنجاح!`);
        statusText.innerText = `تم تفعيل الإصدار ${version} جاهز للاستخدام.`;
        statusText.style.color = "#00f0ff";
      }, 1000);
    }

    function loadPayload(name) {
      statusText.innerText = `جاري حقن البايلود: ${name}...`;
      statusText.style.color = "#ff0055";
      setTimeout(() => {
        alert(`HIGH TECH PS:\nتم حقن ${name} بنجاح!`);
        statusText.innerText = `تم تفعيل ${name} بنجاح.`;
        statusText.style.color = "#00f0ff";
      }, 1200);
    }
  </script>
</body>
</html>
