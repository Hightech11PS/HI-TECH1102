[README.md](https://github.com/user-attachments/files/30744850/README.md)
# Credits to Sistr0 for portage
- [ps4](https://hightechps.github.io/ps4)
- [ps5](https://hightechps.io/ps5)
- [etahen 5.05 devkit](https://zecoxao.github.io/ETAHEN)
- [FTP 5.05 devkit](https://zecoxao.github.io/FTP)
[index.html](https://github.com/user-attachments/files/30744860/index.html)
<!DOCTYPE html>
<html lang="ar" dir="rtl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HIGH TECH PS - PlayStation Exploit Host & Repair Center</title>
    <style>
        :root {
            --bg-color: #0d0f17;
            --card-bg: #161a26;
            --accent-color: #0072ce;
            --accent-hover: #0099ff;
            --goldhen-color: #ffd700;
            --text-color: #e1e6f0;
            --text-muted: #8c9ba5;
            --border-color: #262d40;
        }

        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body {
            background-color: var(--bg-color);
            color: var(--text-color);
            line-height: 1.6;
            padding-bottom: 40px;
        }

        header {
            background: linear-gradient(180deg, #131722 0%, var(--bg-color) 100%);
            border-bottom: 2px solid var(--border-color);
            padding: 30px 20px;
            text-align: center;
        }

        .logo-container {
            margin-bottom: 15px;
        }

        .logo-container img {
            max-width: 180px;
            height: auto;
            filter: drop-shadow(0 0 10px rgba(0, 114, 206, 0.5));
        }

        header h1 {
            font-size: 2.2rem;
            color: #fff;
            letter-spacing: 1px;
        }

        header p {
            color: var(--accent-hover);
            font-size: 1.1rem;
            font-weight: 500;
        }

        .container {
            max-width: 1100px;
            margin: 0 auto;
            padding: 0 20px;
        }

        /* Nav Tabs */
        .console-selector {
            display: flex;
            justify-content: center;
            gap: 15px;
            margin: 30px 0;
        }

        .tab-btn {
            background-color: var(--card-bg);
            color: var(--text-color);
            border: 2px solid var(--border-color);
            padding: 12px 35px;
            font-size: 1.2rem;
            font-weight: bold;
            border-radius: 8px;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        .tab-btn.active, .tab-btn:hover {
            border-color: var(--accent-color);
            background-color: var(--accent-color);
            box-shadow: 0 0 15px rgba(0, 114, 206, 0.4);
        }

        .firmware-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 20px;
            margin-bottom: 40px;
        }

        .fw-card {
            background-color: var(--card-bg);
            border: 1px solid var(--border-color);
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.3);
            transition: transform 0.2s ease;
        }

        .fw-card:hover {
            transform: translateY(-5px);
            border-color: var(--accent-hover);
        }

        .fw-card h3 {
            border-bottom: 1px solid var(--border-color);
            padding-bottom: 10px;
            margin-bottom: 15px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .badge-goldhen {
            background-color: rgba(255, 215, 0, 0.15);
            color: var(--goldhen-color);
            font-size: 0.8rem;
            padding: 4px 8px;
            border-radius: 4px;
            border: 1px solid var(--goldhen-color);
        }

        .payload-list {
            display: flex;
            flex-direction: column;
            gap: 10px;
        }

        .btn-payload {
            background-color: #1f2536;
            color: var(--text-color);
            border: 1px solid var(--border-color);
            padding: 10px 15px;
            border-radius: 6px;
            text-decoration: none;
            text-align: center;
            font-weight: 600;
            display: flex;
            justify-content: space-between;
            align-items: center;
            transition: background 0.2s;
        }

        .btn-payload:hover {
            background-color: var(--accent-color);
            color: #fff;
        }

        .btn-goldhen {
            background-color: rgba(255, 215, 0, 0.1);
            border-color: var(--goldhen-color);
            color: var(--goldhen-color);
        }

        .btn-goldhen:hover {
            background-color: var(--goldhen-color);
            color: #000;
        }

        /* Services Section */
        .services-section {
            background-color: var(--card-bg);
            border-radius: 10px;
            padding: 30px;
            margin-top: 40px;
            border: 1px solid var(--border-color);
        }

        .services-section h2 {
            text-align: center;
            margin-bottom: 25px;
            color: var(--accent-hover);
        }

        .services-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
            gap: 20px;
            text-align: center;
        }

        .service-box {
            background: #121520;
            padding: 20px;
            border-radius: 8px;
            border: 1px solid var(--border-color);
        }

        .service-box h4 {
            margin-bottom: 8px;
            color: #fff;
        }

        footer {
            margin-top: 50px;
            text-align: center;
            color: var(--text-muted);
            font-size: 0.9rem;
        }
    </style>
</head>
<body>

    <header>
        <div class="logo-container">
            <!-- استبدل رابط الصورة برابط اللوجو الخاص بـ HIGH TECH PS -->
            <img src="logo.png" alt="HIGH TECH PS Logo" id="shop-logo">
        </div>
        <h1>HIGH TECH PS</h1>
        <p>مركز صيانة، بيع، شراء وتعديل أجهزة البلايستيشن</p>
    </header>

    <div class="container">
        
        <!-- Console Switcher -->
        <div class="console-selector">
            <button class="tab-btn active" onclick="switchConsole('ps4')">PlayStation 4</button>
            <button class="tab-btn" onclick="switchConsole('ps5')">PlayStation 5</button>
        </div>

        <!-- PS4 Section -->
        <div id="ps4-section" class="firmware-grid">
            
            <!-- FW 5.00 / 5.05 -->
            <div class="fw-card">
                <h3>Firmware 5.05 <span class="badge-goldhen">GoldHEN Ready</span></h3>
                <div class="payload-list">
                    <a href="./payloads/505/goldhen.bin" class="btn-payload btn-goldhen">
                        <span>تشغيل GoldHEN (v2.4b16)</span>
                        <span>⚡</span>
                    </a>
                    <a href="./payloads/505/index.html" class="btn-payload">
                        <span>WebKit Exploit</span>
                        <span>🔗</span>
                    </a>
                </div>
            </div>

            <!-- FW 6.72 -->
            <div class="fw-card">
                <h3>Firmware 6.72 <span class="badge-goldhen">GoldHEN Ready</span></h3>
                <div class="payload-list">
                    <a href="./payloads/672/goldhen.bin" class="btn-payload btn-goldhen">
                        <span>تشغيل GoldHEN (v2.4b16)</span>
                        <span>⚡</span>
                    </a>
                    <a href="./payloads/672/index.html" class="btn-payload">
                        <span>WebKit Exploit</span>
                        <span>🔗</span>
                    </a>
                </div>
            </div>

            <!-- FW 8.00 / 8.03 -->
            <div class="fw-card">
                <h3>Firmware 8.00 / 8.03</h3>
                <div class="payload-list">
                    <a href="./payloads/800/ps4wren.html" class="btn-payload">
                        <span>WebKit Exploit</span>
                        <span>🔗</span>
                    </a>
                    <a href="./payloads/800/payload.bin" class="btn-payload">
                        <span>Kernel Exploit / Loader</span>
                        <span>📦</span>
                    </a>
                </div>
            </div>

            <!-- FW 9.00 -->
            <div class="fw-card">
                <h3>Firmware 9.00 <span class="badge-goldhen">GoldHEN Latest</span></h3>
                <div class="payload-list">
                    <a href="./payloads/900/goldhen_2.4b16.bin" class="btn-payload btn-goldhen">
                        <span>GoldHEN v2.4b16 (Exfathax)</span>
                        <span>⚡</span>
                    </a>
                    <a href="./payloads/900/index.html" class="btn-payload">
                        <span>WebKit Auto-Exploit</span>
                        <span>🔗</span>
                    </a>
                </div>
            </div>

            <!-- FW 10.00 / 11.00 -->
            <div class="fw-card">
                <h3>Firmware 10.00 / 11.00 <span class="badge-goldhen">PPPwn</span></h3>
                <div class="payload-list">
                    <a href="./payloads/1100/pppwn_goldhen.bin" class="btn-payload btn-goldhen">
                        <span>GoldHEN (PPPwn Executable)</span>
                        <span>⚡</span>
                    </a>
                    <a href="./payloads/1100/index.html" class="btn-payload">
                        <span>PPPwn Web Stage Loader</span>
                        <span>🔗</span>
                    </a>
                </div>
            </div>

            <!-- FW 11.02 -->
            <div class="fw-card">
                <h3>Firmware 11.02</h3>
                <div class="payload-list">
                    <a href="./payloads/1102/index.html" class="btn-payload">
                        <span>WebKit Entry Point</span>
                        <span>🔗</span>
                    </a>
                    <a href="#" class="btn-payload" style="opacity:0.6; cursor:not-allowed;">
                        <span>قريباً: PPPwn v2 Support</span>
                        <span>⏳</span>
                    </a>
                </div>
            </div>

        </div>

        <!-- PS5 Section (Hidden by default) -->
        <div id="ps5-section" class="firmware-grid" style="display: none;">
            <div class="fw-card">
                <h3>PS5 Firmware 3.xx - 4.xx</h3>
                <div class="payload-list">
                    <a href="./payloads/ps5/etaHEN.bin" class="btn-payload btn-goldhen">
                        <span>تشغيل etaHEN (PS5)</span>
                        <span>⚡</span>
                    </a>
                    <a href="./payloads/ps5/index.html" class="btn-payload">
                        <span>UMTX / WebKit Exploit</span>
                        <span>🔗</span>
                    </a>
                </div>
            </div>
        </div>

        <!-- Shop Services -->
        <div class="services-section">
            <h2>خدمات مركز HIGH TECH PS</h2>
            <div class="services-grid">
                <div class="service-box">
                    <h4>🛠️ صيانة وتصليح</h4>
                    <p>صيانة جميع أعطال الباور، البوردة، والدريفت في أذرع التحكم.</p>
                </div>
                <div class="service-box">
                    <h4>🚀 تعديل وتهكير</h4>
                    <p>تنزيل أحدث السوفت وير والألعاب وتفعيل GoldHEN لجميع الإصدارات.</p>
                </div>
                <div class="service-box">
                    <h4>🔄 بيع وشراء</h4>
                    <p>بيع وشراء أجهزة PS4 / PS5 والاكسسوارات بأسعار ممتازة.</p>
                </div>
            </div>
        </div>

    </div>

    <footer>
        <p>HIGH TECH PS Center &copy; 2026 - جميع الحقوق محفوظة</p>
    </footer>

    <script>
        function switchConsole(consoleType) {
            const ps4Sec = document.getElementById('ps4-section');
            const ps5Sec = document.getElementById('ps5-section');
            const buttons = document.querySelectorAll('.tab-btn');

            buttons.forEach(btn => btn.classList.remove('active'));

            if(consoleType === 'ps4') {
                ps4Sec.style.display = 'grid';
                ps5Sec.style.display = 'none';
                buttons[0].classList.add('active');
            } else {
                ps4Sec.style.display = 'none';
                ps5Sec.style.display = 'grid';
                buttons[1].classList.add('active');
            }
        }
    </script>
</body>
</html>
