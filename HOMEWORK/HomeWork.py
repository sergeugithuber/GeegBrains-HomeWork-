import telebot
from telebot import types
token = "5519358073:AAE3d9PaqhK1AdoTeZMwrDkS0V7AoKtWLMU"

bot = telebot.TeleBot(token)

@bot.message_handler(commands=["start"])
def message_start(message):
   bot.send_message(message.from_user.id, "Привет!")

name = ''
password = ''
@bot.message_handler(commands=["reg"])
def reg_message(message):
   global name
   bot.send_message(message.from_user.id, "Как тебя зовут?")
   name = message.text
   bot.register_next_step_handler(message, password_message)

def password_message(message):
   global password
   bot.send_message(message.from_user.id, "Введи пароль:")
   password = message.text

@bot.message_handler(commands=["help"])
def help_message(message):
   bot.send_message(message.from_user.id, "  Commands:\n/start\n/reg\n/help\n/my_name")

@bot.message_handler(commands=["my_name"])
def print_name_password_message(message):
   bot.send_message(message.from_user.id, name)

bot.infinity_polling()