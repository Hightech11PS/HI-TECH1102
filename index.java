<!DOCTYPE html>
<html lang="ar" dir="rtl" manifest="cache.manifest">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>HIGH TECH PS - مركز صيانة بلاي ستيشن</title>
  <link rel="stylesheet" href="includes/style.css">
  <style>
    * {
      box-sizing: border-box;
      margin: 0;
      padding: 0;
    }
    body {
      text-align: center;
      font-family: 'Segoe UI', Arial, sans-serif;
      background-color: #121212;
      color: #ffffff;
      padding: 20px;
      line-height: 1.6;
    }
    h1 {
      color: #00a2ff;
      margin-bottom: 5px;
      text-transform: uppercase;
      letter-spacing: 1px;
    }
    h2 {
      font-size: 1.1rem;
      color: #aaa;
      margin-bottom: 15px;
    }
    .user-agent-info {
      font-size: 0.85rem;
      background: #1e1e1e;
      display: inline-block;
      padding: 6px 15px;
      border-radius: 20px;
      margin-bottom: 15px;
      color: #00a2ff;
      border: 1px solid rgba(0, 162, 255, 0.3);
    }
    .logo-container img {
      max-width: 280px;
      width: 100%;
      height: auto;
      border-radius: 15px;
      box-shadow: 0 4px 20px rgba(0, 162, 255, 0.3);
      margin: 10px 0 20px 0;
      transition: transform 0.3s ease;
    }
    .logo-container img:hover {
      transform: scale(1.02);
    }
    .section-title {
      color: #00a2ff;
      margin: 15px 0 10px 0;
      font-size: 1.1rem;
      border-bottom: 2px solid #00a2ff;
      display: inline-block;
      padding-bottom: 4px;
    }
    .select-group {
      margin-bottom: 15px;
    }
    .firmware-select {
      width: 90%;
      max-width: 400px;
      padding: 12px;
      border-radius: 8px;
      border: 1px solid #00a2ff;
      background-color: #1e1e1e;
      color: #fff;
      font-size: 15px;
      outline: none;
      cursor: pointer;
      transition: border-color 0.2s, box-shadow 0.2s;
    }
    .firmware-select:focus {
      border-color: #00d4ff;
      box-shadow: 0 0 8px rgba(0, 162, 255, 0.5);
    }
    .btn-container {
      margin: 25px 0;
    }
    .radio-group {
      display: flex;
      justify-content: center;
      gap: 15px;
      margin-bottom: 15px;
    }
    .radio-group label {
      cursor: pointer;
      background: #1e1e1e;
      padding: 6px 12px;
      border-radius: 6px;
      border: 1px solid #333;
    }
    .btn-submit {
      padding: 12px 30px;
      font-size: 17px;
      font-weight: bold;
      background: linear-gradient(45deg, #0072ff, #00c6ff);
      color: white;
      border: none;
      border-radius: 8px;
      cursor: pointer;
      box-shadow: 0 4px 12px rgba(0, 114, 255, 0.4);
      transition: background 0.3s, transform 0.1s;
    }
    .btn-submit:hover {
      opacity: 0.9;
    }
    .btn-submit:active {
      transform: scale(0.98);
    }
    .autoJb {
      margin-top: 12px;
      font-size: 14px;
      color: #ccc;
    }
    .console-wrapper {
      max-width: 600px;
      margin: 20px auto 0 auto;
      text-align: right;
    }
    #console {
      background-color: #0a0a0a;
      border: 1px solid #222;
      border-radius: 8px;
      padding: 12px;
      color: #00ff66;
      font-family: 'Consolas', 'Courier New', monospace;
      font-size: 13px;
      min-height: 80px;
      max-height: 200px;
      overflow-y: auto;
      white-space: pre-wrap;
      direction: ltr;
    }
  </style>
</head>
<body>

  <h1>HIGH TECH PS</h1>
  <h2>مركز صيانة بلاي ستيشن</h2>
  
  <div class="user-agent-info" id="UA">جاري فحص الجهاز...</div>

  <!-- اللوجو -->
  <div class="logo-container">
    <img src="assets/logo.png" id="main-logo" alt="HIGH TECH PS Logo" onerror="this.style.display='none'">
  </div>

  <hr style="border-color: #222; margin: 15px 0;">

  <!-- خيارات PS4 -->
  <div class="select-group">
    <h3 class="section-title">إصدارات وتعديلات PS4</h3>
    <br>
    <select class="firmware-select" id="ps4-firmware">
      <option value="">اختر إصدار PS4...</option>
      <optgroup label="إصدارات التعديل (Jailbreak)">
        <option value="5.05">Firmware 5.05 (HEN / GoldHEN)</option>
        <option value="6.72">Firmware 6.72 (HEN / GoldHEN)</option>
        <option value="7.02">Firmware 7.02 (HEN / GoldHEN)</option>
        <option value="7.55">Firmware 7.55 (HEN / GoldHEN)</option>
        <option value="9.00">Firmware 9.00 (pPSSipow / GoldHEN)</option>
        <option value="11.00">Firmware 11.00 (PPPwn)</option>
      </optgroup>
      <optgroup label="إصدارات رسمية أخري">
        <option value="9.03">Firmware 9.03</option>
        <option value="9.50">Firmware 9.50</option>
        <option value="10.00">Firmware 10.00</option>
        <option value="10.01">Firmware 10.01</option>
        <option value="10.50">Firmware 10.50</option>
        <option value="11.02">Firmware 11.02</option>
      </optgroup>
    </select>
  </div>

  <!-- خيارات PS5 -->
  <div class="select-group">
    <h3 class="section-title">إصدارات وتعديلات PS5</h3>
    <br>
    <select class="firmware-select" id="ps5-firmware">
      <option value="">اختر إصدار PS5...</option>
      <optgroup label="إصدارات تعديل PS5">
        <option value="1.xx">Firmware 1.xx (1.00 - 1.14)</option>
        <option value="2.xx">Firmware 2.xx (2.00 - 2.70)</option>
        <option value="3.xx">Firmware 3.00 - 3.21</option>
        <option value="4.03">Firmware 4.03 (ETAHEN / Mast1c0re)</option>
        <option value="4.50">Firmware 4.50 (ETAHEN)</option>
        <option value="4.51">Firmware 4.51 (ETAHEN / UMTX)</option>
        <option value="5.00-5.50">Firmware 5.00 - 5.50 (UMTX)</option>
      </optgroup>
    </select>
  </div>

  <!-- خيارات التحميل والتشغيل -->
  <div class="btn-container">
    <div class="radio-group">
      <label for="netctrl-exploit">
        <input type="radio" name="kernel" id="netctrl-exploit" value="netctrl" checked> NetCtrl
      </label>
      <label for="lapse-exploit">
        <input type="radio" name="kernel" id="lapse-exploit" value="lapse"> Lapse
      </label>
    </div>

    <button id="jeilbrek" class="btn-submit">تشغيل التعديل</button>

    <div class="autoJb">
      <input id="autoJbInput" type="checkbox">
      <label for="autoJbInput" id="autoJbLabel">تشغيل تلقائي عند الفتح</label>
    </div>
  </div>

  <!-- نافذة الكونسول للمخرجات -->
  <div class="console-wrapper">
    <pre id="console">[+] جاهز للبدء... awaiting execution</pre>
  </div>

  <!-- السكريبت الداخلي لإدارة الواجهة -->
  <script>
    document.addEventListener("DOMContentLoaded", () => {
      // 1. عرض معلومات المتصفح (User Agent)
      const uaElement = document.getElementById("UA");
      if (uaElement) {
        uaElement.innerText = "معلومات المتصفح: " + navigator.userAgent;
      }

      const ps4Select = document.getElementById("ps4-firmware");
      const ps5Select = document.getElementById("ps5-firmware");
      const btn = document.getElementById("jeilbrek");
      const consoleLog = document.getElementById("console");

      // 2. إغلاق القائمة الأخرى عند اختيار إحداهما
      ps4Select.addEventListener("change", () => {
        if (ps4Select.value) ps5Select.value = "";
      });
      ps5Select.addEventListener("change", () => {
        if (ps5Select.value) ps4Select.value = "";
      });

      // 3. معالجة الضغط على زر التشغيل
      btn.addEventListener("click", () => {
        const selectedFirmware = ps4Select.value || ps5Select.value;
        const selectedKernel = document.querySelector('input[name="kernel"]:checked')?.value;

        if (!selectedFirmware) {
          consoleLog.innerText = "[!] ينبغي اختيار إصدار النظام أولاً.";
          return;
        }

        consoleLog.innerText = `[+] جاري تشغيل التعديل للإصدار: ${selectedFirmware}\n[+] نمط المحرك: ${selectedKernel}...`;
      });
    });
  </script>

  <script src="src/main.js"></script>
  <script src="includes/script.js"></script>
</body>
</html>