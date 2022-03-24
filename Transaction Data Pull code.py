import discord
import requests
import logging
from time import time, sleep
from discord.ext import tasks, commands
from threading import Timer
from discord.ext import commands
import asyncio
from datetime import datetime
import csv


'''client = discord.Client()
bot = commands.Bot(command_prefix='$')'''

def a():
    w = int(input("Stop at? "))
    for i in range(w,1000000):
        with open(f"Txn Historical Data{i}.csv", 'a', newline='') as f:
            writer = csv.writer(f)
            writer.writerow(["Transaction Date Time", "Block Number", "GWei", "Gas Used", "Matic Paid"])
        for j in range(1,1001):
                    url2 = f'https://api.polygonscan.com/api?module=account&action=txlist&address=0x6e5Fa679211d7F6b54e14E187D34bA547c5d3fe0&startblock=0&endblock=99999999&page={j}&offset=1&sort=desc&apikey=1NG5ZP8VAKCY7BK3E7X86KUI78HSVDCEZB'
                    print(url2)
                    req2 = requests.get(url2, timeout = 30)
                    text2 = req2.json()
                    text2a = text2["result"]
                    text2b = text2a[0]
                    timetext = text2b["timeStamp"]
                    dt = datetime.fromtimestamp(int(timetext))
                    gaspdec = len(text2b["gasPrice"])
                    gasp = (int(text2b["gasPrice"]) * (10**-9))
                    gaspd = "{:.1f}".format(gasp)
                    gasu = (int(text2b["gasUsed"]) * 10**-9)
                    gasudisplay = int(text2b["gasUsed"])
                    maticu = gasp * gasu
                    BlockN = text2b["blockNumber"]
                    row = [dt, BlockN, gaspd, gasudisplay, maticu]
                    print(row)
                    with open(f"Txn Historical Data{i}.csv", 'a', newline='') as f:
                        writer = csv.writer(f)
                        writer.writerow(row)
        sleep(3600)
a()
